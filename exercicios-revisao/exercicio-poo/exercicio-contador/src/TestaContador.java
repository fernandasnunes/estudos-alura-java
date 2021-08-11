public class TestaContador {

    public static void main(String[] args) {

        System.out.println("Inicializando contador");

        Contador contador = new Contador();

        contador.incrementarContador();
        contador.incrementarContador();
        contador.incrementarContador();

        System.out.println(contador.retornaContador());
        System.out.println("Zerando contador");

        contador.zerarContador();
        System.out.println(contador.retornaContador());

    }
}
