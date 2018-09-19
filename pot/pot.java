import java.util.Scanner;
public class pot {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        int numInputs = scnr.nextInt();
        int totalSum = 0;

        for (int i = 0; i < numInputs; ++i) {
            int userNum = scnr.nextInt();
            int power = (userNum % 10);
            int base = (userNum / 10);

            totalSum = (int)Math.pow(base, power) + totalSum;

        }


        System.out.println(totalSum);
        
    }
}