import java.util.Scanner;
public class autori {

    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);

        String name = scnr.next();

        for (int i = 0; i < name.length(); i++) {
            char currentLetter = name.charAt(i);
            if (Character.isUpperCase(currentLetter)) {
                System.out.print(currentLetter);
            }
        }
            
    }
}