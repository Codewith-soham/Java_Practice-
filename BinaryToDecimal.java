public class BinaryToDecimal {
    
    public static void BinToDec(int BinNum){
        int pow = 0;
        int dec = 0;
        while (BinNum > 0) {
            int ld = BinNum % 10;

            dec = dec + (ld * (int)Math.pow(2, pow));

            pow++;
            BinNum = BinNum/10;
        }
        System.out.println("Decimal value is = " + dec);
    }

    public static void main(String[] args) {
        BinToDec(101);
    }
}
