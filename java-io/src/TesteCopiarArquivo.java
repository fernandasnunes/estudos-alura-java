import java.io.*;

public class TesteCopiarArquivo {
        public static void main(String[] args) throws IOException {
            System.out.println(new File("input.txt").getAbsolutePath());
            InputStream fis = System.in; //new FileInputStream("lorem.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = new FileOutputStream("lorem5.txt"); //System.out (console)
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.newLine();
            bw.newLine();

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                bw.write(linha);
                linha = br.readLine();
            }

            br.close();
            bw.flush(); // pegar tudo e ja descarregar
            bw.close();

        }
        }



