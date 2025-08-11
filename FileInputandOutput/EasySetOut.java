import java.io.FileOutputStream;
import java.io.PrintStream;

public class EasySetOut {
    public static void main(String[] args) {
        try {
            PrintStream psi = new PrintStream(new FileOutputStream("sample.java"));
            System.setOut(psi); // redirect output to file

            System.out.println("Hello from Soham!");
            System.out.println("This text goes into sample.java");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
