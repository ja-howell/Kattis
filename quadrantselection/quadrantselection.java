import java.util.Scanner;
public class quadrantselection {

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);

        int x = scnr.nextInt();
        int y = scnr.nextInt();

        if(x > 0) {
            if(y > 0) {
                System.out.println("1");
            }
            else {
                System.out.println("4");
            }
        }
        else {
            if(y > 0) {
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }
        }
    }
}        