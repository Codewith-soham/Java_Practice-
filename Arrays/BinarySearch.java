public class BinearySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            //comparisions
            if (numbers[mid] == key) { //found
                return mid; //return index of mid 
            }
            if (numbers[mid] < key) {  
                start = mid+1;  //left half
            }else{
                end = mid - 1; //right half
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 13};
        int key = 10;

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }    
}
