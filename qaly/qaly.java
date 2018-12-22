import java.util.Scanner;
public class qaly{
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        double quality;
        double quantity;
        int constant;
        double QAYL = 0.0;

        constant = scnr.nextInt();

        for(int i = 0; i < constant; ++i) {
        quality = scnr.nextDouble();
        quantity = scnr.nextDouble();

        QAYL = QAYL + (quality * quantity);
        }

        System.out.println(QAYL);

    }
}