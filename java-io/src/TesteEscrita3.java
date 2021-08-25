import java.io.*;

public class TesteEscrita3 {

            public static void main(String[] args) throws IOException {
                System.out.println(new File("input.txt").getAbsolutePath());

                PrintStream ps = new PrintStream("lorem5.txt");

               ps.println("Testando");
               ps.println();

            }
            }



