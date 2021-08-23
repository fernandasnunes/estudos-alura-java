package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;

import java.util.*;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();


        List<Conta> lista2 = new ArrayList<Conta>();
        List<Conta> lista3 = new LinkedList<>();
        List<Conta> lista4 = new Vector<>(); //thread safe - compartilhar lista entre pilhas (varios mains)



        Conta cp = new ContaPoupança(22, 11);
        Conta cc = new ContaCorrente(88, 78);
        Conta c1 = new ContaCorrente(55, 66);
        Conta c2 = new ContaCorrente(44, 77);


        lista.add(cp);
        lista.add(cc);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(0);

        System.out.println(ref.getNumero());
        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());
        lista.add(c1);
        lista.add(c2);

        for(int i =0; i < lista.size(); i++){
            Object oref = lista.get(i);
            System.out.println(oref);
        }

        // Para cada element do tipo object interar sob a lista, exatamente igual o for acima, sem o i, mais elegante.
        System.out.println("-----------");
        for(Object oref: lista){
            System.out.println(oref);
        }
    }
}
