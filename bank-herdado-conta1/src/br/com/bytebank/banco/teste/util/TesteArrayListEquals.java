package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Conta cp = new ContaPoupança(22, 11);
        Conta cc = new ContaCorrente(88, 78);
        Conta c1 = new ContaCorrente(55, 66);
        Conta c2 = new ContaCorrente(44, 77);
        Conta c3 = new ContaCorrente(44, 77);


        lista.add(cp);
        lista.add(cc);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = (Conta) lista.get(0);

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

        boolean existe = lista.contains(c3);
        System.out.println("Ja existe? " +  existe);



    }
}
