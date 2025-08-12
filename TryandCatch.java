public class TryandCatch {
    public static void main(String[] args) {
        try {
            int num = 5 / 0;
            System.out.println("This line won't work.");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } finally {
            System.out.println("This part will always work");
        }
    }
}
