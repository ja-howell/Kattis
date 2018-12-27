import java.util.Scanner;

public class lastfactorialdigit {
    public static void main(String [] args) {
        int testCases = 0;
        int num = 0;
        int lastDigit = 0;
        int prod;
        Scanner kb = new Scanner(System.in);

        testCases = kb.nextInt();
        for(int i = 0; i < testCases; i++) {
            num = kb.nextInt();
            prod = 1;
            for(int j = 1; j <= num; j++) {
                prod *= j; 
            }
            lastDigit = prod % 10;
            System.out.println(lastDigit);
        }

    }
}