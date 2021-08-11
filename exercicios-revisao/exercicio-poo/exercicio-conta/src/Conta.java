import java.util.Locale;

public class Conta {

    private String nome;
    private int numConta;
    private double saldo;

    public Conta(String nome, int numConta, double saldo ) {

        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(int valor){

        this.saldo += valor;
    }
    public void saque(int valor){

        if(this.saldo < valor) {
            System.out.println("Você não tem valor suficiente para sacar");
        }
        else {
            this.saldo -= valor;
        }
    }

}
