package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;

public class TesteArrayReferencia {
    public static void main(String[] args) {
        Conta[] conta = new Conta[5];

        Conta cc = new ContaCorrente(123,412);
        Conta cp = new ContaPoupança(312,454);

        conta[0] = cc;
        conta[1] = cp;

        System.out.println(conta[0].getNumero());
        System.out.println(conta[1].getNumero());


    }
}
