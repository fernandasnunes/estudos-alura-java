package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaContas {

    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(22, 11);
        cc.deposita(100.0);
        ContaPoupança cp = new ContaPoupança(44,77);
        //reutilizando métodos da classe br.com.bytebank.banco.modelo.Conta.
        cp.deposita(200.0);

        cc.transfere(10.0, cp);
        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());




    }
}
