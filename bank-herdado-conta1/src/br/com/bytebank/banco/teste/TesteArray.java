package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

import javax.sound.midi.Soundbank;

public class TesteArray {
    public static void main(String[] args) {
        Conta cp = new ContaPoupança(123,213);
        Conta cc = new ContaCorrente(123,213);
        Cliente cliente = new Cliente();
        cliente.setNome("Fernanda");
        GuardaContas guardador = new GuardaContas();
        guardador.adiciona(cp);
        guardador.adiciona(cc);

        System.out.println("Tamanho do Array");
        System.out.println(guardador.retornaTamanho());

        Conta imprimirConta = (Conta) guardador.imprimiArray(1);
        System.out.println(imprimirConta.getNumero());

    }
}
