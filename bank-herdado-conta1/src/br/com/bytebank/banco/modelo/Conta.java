package br.com.bytebank.banco.modelo;

public abstract class Conta implements Comparable<Conta>{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);


    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Valor menor que o saldo " + this.saldo + " Valor: " + valor);
        }
        this.saldo -= valor;


    }

    // isso funciona por conta do polimorfismo, tenho uma referencia que refere do tipo conta, e utilizar qualaquer tipo de conta.
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        // ele só vai executar essa linha, se o saca funciona, pq no método saca ja é feito o tratamento de erro, se der erro, ele estoura o erro na pilha.
        this.saca(valor);
        // e consequentemente ele nem vai chegar no deposita, pq se der erro, a exception muda o fluxo.
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    @Override
    public String toString() {
        return " Numero" + getNumero() + " Agencia " + this.agencia;
    }

    @Override
    public boolean equals(Object ref) {

        // transformando a referencia generica em uma referencia do tipo espeficca, para conseguir pegar agencia de ref
        Conta conta = (Conta) ref;
        if(this.agencia != ((Conta) ref).agencia){
            return false;
        }
        if(this.numero != ((Conta) ref).numero){
            return false;
        }
        return true;
    }
    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }
}