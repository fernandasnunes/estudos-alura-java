package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupança;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupança(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupança(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);


        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta: lista)
        {
            // imprimir a conta significa chamar a tostring por debaixo dos panos.
            System.out.println(conta);
        }

        // NumerodaContaComparator comparator = new NumerodaContaComparator();
        TitularDaContaComparator2 titularComparator = new TitularDaContaComparator2();

        // sort para realizar a ordenação, e é necessário passsar um operator de comparação.
        lista.sort(titularComparator);
        Collections.sort(lista);
        // classe anonima, e internamente as lambdas fazendo a mesma coisa mas com uma sintaxe melhor
         lista.sort(new Comparator<Conta>(){
             @Override
             public int compare(Conta c1, Conta c2) {

                 // mas também podemos usar o wrapper da classe int, que ja tem um método de comparação.
                 return Integer.compare(c1.getNumero(), c2.getNumero());
             }
         });

        System.out.println("------------");
        for (Conta conta: lista)
        {
            // imprimir a conta significa chamar a tostring por debaixo dos panos.
            System.out.println(conta + ", " + conta.getTitular().getNome() + "Saldo " + conta.getSaldo());
        }


    }

}

// Override no método de compare, para ordenar os números de conta do menor para o maior.
class NumerodaContaComparator2 implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        // mas também podemos usar o wrapper da classe int, que ja tem um método de comparação.
        return Integer.compare(c1.getNumero(), c2.getNumero());

        // outra forma de fazer a comparação.
        //  return c1.getNumero() - c2.getNumero();
 /*   if(c1.getNumero() < c2.getNumero()){
        // retorna um negativo caso a comparação seja falsa.
        return -345;
    }
    if(c1.getNumero() > c2.getNumero()){
        return 1;
    }
        //se os numeros forem iguais, o return é zero.
        return 0;
    }*/
    }

}
class TitularDaContaComparator2 implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c1.getTitular().getNome();

        // utilizando o método compare to que ja compara as duas strings por ordem alfabética
        return nomeC1.compareTo(nomeC2);
    }
}

