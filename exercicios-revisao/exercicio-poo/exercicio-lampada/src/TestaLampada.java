public class TestaLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.liga();
        System.out.println(lampada.getEstado());
        lampada.desliga();
        System.out.println(lampada.getEstado());
    }
}
