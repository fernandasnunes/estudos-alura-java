package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {
        // strinh é um objeto
        String name = "ALura"; //object literal
        // e poderia ser declarada dessa forma
        //String outro = new String("Fulano");

        // Qualquer alteração, uma nova string, porque a classe string é imutavel.
        // substituir uma sequencia de caracteres.
        //String outra = name.replace("A", "a");

      //  System.out.println(outra);

        // qual caracter está na posição 2 da string name;
   /*     char c = name.charAt(2);
        System.out.println(c);*/

        // qual a posicao que se inicia a substring "ur" dentro da String name.
//        int pos = name.indexOf("ur");
//        System.out.println(pos);

        // retorna uma substring que começa na posição 1, da string name.
        /*String substring = name.substring(1);
        System.out.println(substring);
*/

     /*   //pegar tamanho da string.
        System.out.println(name.length());

        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }*/

        // isEmpty  verifica se a string está vazia.
        String vazio = "Alura";
        // remove espaços no inicio e no fim da string;
        String outrovazio = vazio.trim();
        // contais se contem essa sequencia dentro da string..
        System.out.println(outrovazio.contains("Alu"));
        System.out.println(outrovazio.isEmpty());

        // StringBuilder facilitar a concatenação, e ela é mutavel, então não precisamos ficar criando variaveis na mémoria para ir concatenando,
        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);
    }
}
