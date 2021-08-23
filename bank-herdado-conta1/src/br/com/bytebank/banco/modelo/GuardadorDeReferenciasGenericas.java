package br.com.bytebank.banco.modelo;

public class GuardadorDeReferenciasGenericas {
    private Object[] arrayConta;
    private int pos;
    public GuardadorDeReferenciasGenericas(){
        this.arrayConta = new Object[10];
        this.pos = 0;
    }
    public void adiciona(Object conta){
        this.arrayConta[pos] = conta;
        this.pos ++;

    }

    public int retornaTamanho(){
        return this.pos;

    }
    public Object imprimiArray(int pos){
        return (Object) this.arrayConta[pos];
    }
}
