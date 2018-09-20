import java.util.Scanner;
public class faktor {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int articles = scnr.nextInt();
        int cites = 0;
        int iFactor = scnr.nextInt();
        iFactor = iFactor - 1;
        cites = iFactor * articles + 1;

        System.out.println(cites);
    }
}