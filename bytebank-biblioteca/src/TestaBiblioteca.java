import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaBiblioteca {
    public static void main(String[] args) throws SaldoInsuficienteException {

        Conta c = new ContaCorrente(123,321);

        c.deposita(200);
        c.saca(100);

        System.out.println(c.getSaldo());
    }
}
