public class Checkvowels {
    public static void main(String[] args) {
          String n = "hello";
          boolean hasvowel = false;

          for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u' ) {
                hasvowel = true;
                break;
            }
        }
            if(hasvowel){
                System.out.println("Vowels found in string");
            }else{
                System.out.println("Vowels not found in string");
            }
    }

}
