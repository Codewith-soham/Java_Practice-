import java.io.FileInputStream;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sample.java");
            System.setIn(fis); // Now System.in reads from sample.java

            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
