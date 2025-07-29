public class NonRepeatedChar {
    public static void main(String[] args) {
        String name = "hello";

        for (int i = 0; i < name.length(); i++) {
            char curr = name.charAt(i);

            int count = 0;

            for (int j = 0; j < name.length(); j++) {
                if(curr == name.charAt(j)){
                    count = count + 1;
                }
            }
            if(count == 1){
                System.out.println("Non repeated chars are: " + curr);
            }
        }
    }
}