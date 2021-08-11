public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta("Fernanda", 22, 22);

        conta.setSaldo(200.0);
        conta.depositar(100);
        System.out.println(conta.getSaldo());
        conta.saque(400);
        System.out.println(conta.getSaldo());

    }
}
