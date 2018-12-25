import java.util.Scanner;

public class nastyhacks {
    public static void main(String [] args) {
        int testCases, noAd, ad, adCost;
        Scanner kb = new Scanner(System.in);

        testCases = kb.nextInt();
        for(int i = 0; i < testCases; ++i) {
            noAd = kb.nextInt();
            ad = kb.nextInt();
            adCost = kb.nextInt();

            if((ad - adCost) > noAd) {
                System.out.println("advertise");
            }
            else if((ad - adCost) < noAd) {
                System.out.println("do not advertise");
            }
            else {
                System.out.println("does not matter");
            }

        }
    }

}