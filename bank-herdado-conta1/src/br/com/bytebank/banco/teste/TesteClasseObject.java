package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;

public class TesteClasseObject {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(22,83);
        System.out.println(conta.toString());

        ContaPoupança cp = new ContaPoupança(55,77);
        //poderia remover o toString pq p pŕintln chama o toString internamente.
        System.out.println(cp.toString());
    }
}
