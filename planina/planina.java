import java.util.Scanner;

public class planina {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int numIs = 0;
        int points = 0;
        int side = 2;

        numIs = kb.nextInt();

        for(int i = 0; i < numIs; ++i) {
            side = (side * 2) - 1;
        }
        points = side * side;
        System.out.println(points);
    }

}