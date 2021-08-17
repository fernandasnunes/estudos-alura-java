import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class TesteSacaExceptions {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200.00);

        try{

            conta.saca(210.0);
        }
        catch (SaldoInsuficienteException ex){

            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
