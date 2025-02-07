public class JavaBasic {
    public static void decTObin(int decNum) {
        int receivedNum = decNum;
        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum += rem * (int) Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }
        System.out.println("Decimal : " + receivedNum);
        System.out.println("Binary : " + binNum);
    }

    public static void main(String args[]) {
        decTObin(5);
    }
}