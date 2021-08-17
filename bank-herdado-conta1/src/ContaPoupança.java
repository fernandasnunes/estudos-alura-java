public class ContaPoupança extends Conta{

    //Precisa montar o construtor, pois ela herdando de conta, e ela tem um construtor, se não quisser, é só montar um construtor padrão na classe conta.
    public ContaPoupança(int agencia, int numero ){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
