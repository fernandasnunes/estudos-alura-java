package br.com.bytebank.banco.modelo;

// não precisa colocar o abstract pq isso ja é implicito pq tudo dentro da interface é abstrato
public interface Tributavel {

    // não precisa do public abstract pq também é já implicito
    public abstract double getValorImposto();
}
