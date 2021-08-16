import java.sql.SQLOutput;

public enum Prioridade {
    MAX(10), MIN(5), NORMAL(2);

    private int valor;

    //atribuindo valor para o enum, passando no construtor.
    Prioridade(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
