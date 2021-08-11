public class Conta {

    private int numConta;
    protected double saldo;

    public Conta(int numConta, double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void creditar(int valor){
        this.saldo += valor;
    }
    public void debitar(int valor){
        this.saldo -= valor;
    }
    public int getNumConta() {
        return numConta;
    }
    public double getSaldo() {
        return saldo;
    }


}
