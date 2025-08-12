public class PrimeNo {
    public static void main(String[] args) {
        int num = 4;
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else{
            for (int i = 2; i < num; i++) {
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("number is prime number");
        }else{
            System.out.println("Number is not a prime number");
        }
    }
}
