import java.util.Scanner;
public class sibice {

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);

        int numMatches = scnr.nextInt();
        int boxWidth = scnr.nextInt();
        int boxHeight = scnr.nextInt();
        int maxLength = (int)Math.sqrt((boxWidth * boxWidth) + (boxHeight *boxHeight));

        for(int i = 0; i < numMatches; ++i) {
            int matchLength = scnr.nextInt();
                if( matchLength > maxLength) {
                    System.out.println("NE");
                }
                else {
                    System.out.println("DA");
                }
        }

    }
}