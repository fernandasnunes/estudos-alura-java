package br.com.bytebank.banco.modelo;

public class GuardaContas {

    private Conta[] arrayConta;
    private int pos;
    public GuardaContas(){
        this.arrayConta = new Conta[10];
        this.pos = 0;
    }
    public void adiciona(Conta conta){
        this.arrayConta[pos] = conta;
        this.pos ++;

    }

    public int retornaTamanho(){
        return this.pos;

    }
    public Conta imprimiArray(int pos){
      return this.arrayConta[pos];
    }

}
