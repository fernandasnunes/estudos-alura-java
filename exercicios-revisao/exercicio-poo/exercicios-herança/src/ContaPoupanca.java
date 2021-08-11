public class ContaPoupanca extends Conta{

    private double juros;

    public ContaPoupanca(int numConta, double saldo, double juros) {
        super(numConta, saldo);
        this.juros = juros;

    }

    public double aplicarJuros(){
        return this.saldo =  this.saldo * this.juros + this.saldo;

    }
}
