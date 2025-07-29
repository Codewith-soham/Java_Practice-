public class PairZeroinArray {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , -1 , 5 , 8};
        
        int num1 = 0;
        int num2 = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = arr[i] + arr[j];

                int absum;
                if(sum < 0){
                    absum = -sum;
                }else{
                    absum = sum;
                }

                if(absum < min){
                    min = absum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println("Pair of numbers whose addition is zero is: " + num1 + " and " + num2);
    }
}
