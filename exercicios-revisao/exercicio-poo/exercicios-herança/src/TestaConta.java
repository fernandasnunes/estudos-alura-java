public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta(11, 22.0);
        conta.creditar(200);
        System.out.println("Valor da conta");
        System.out.println(conta.getSaldo());
        conta.debitar(100);
        System.out.println("Valor da conta");
        System.out.println(conta.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(222,2000, 0.01);

        cp.aplicarJuros();
        System.out.println("Valor do saldo depois de calcular juros");
        System.out.println(cp.getSaldo());
        cp.debitar(100);
        System.out.println(cp.getSaldo());
        cp.creditar(100);
        System.out.println(cp.getSaldo());
    }
}
