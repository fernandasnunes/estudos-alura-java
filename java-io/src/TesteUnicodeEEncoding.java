import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) {
        String s = "C";
        // descobrir qual o numero na tabela unicode
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset(); // qual é o encoding padrão aplicado.

        // descobrir qual é a tabela de encoding.
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + "UTF-8");

        //forçar um encoding
        byte[] bytes2 = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes2.length + "UTF-8");

        byte[] bytes3 = s.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes3.length + "UTF-16");

        //transformando bytes em strings.

        String snovo = new String(bytes2);
        System.out.println(snovo);

    }
}
