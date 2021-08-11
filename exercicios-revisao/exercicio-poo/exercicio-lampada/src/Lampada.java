public class Lampada {

    public String estado;

    public Lampada(){
        this.estado = "Desligado";
    }
    public void liga(){
        this.estado = "Ligada";
    }
    public void desliga(){
        this.estado = "Desligado";
    }

    public String getEstado() {
        return estado;
    }
}
