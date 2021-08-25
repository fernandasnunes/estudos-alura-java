import java.io.*;

public class TesteEscrita {

            public static void main(String[] args) throws IOException {
                System.out.println(new File("input.txt").getAbsolutePath());

                OutputStream fos = new FileOutputStream("lorem2.txt");
                Writer osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry.!");
                bw.newLine();
                bw.newLine();
                bw.close();
            }
            }



