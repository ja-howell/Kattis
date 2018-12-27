import java.util.Scanner;

public class trik {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        // int cups[] = {1, 2, 3}; 
        String moves;
        int place = 1;

        moves = kb.next();
        for(int i = 0; i < moves.length(); ++i) {
            if(moves.charAt(i) == 'A' && place == 1) {
                place = 2;
            }
            else if(moves.charAt(i) == 'A' && place == 2) {
                place = 1;
            }
            else if(moves.charAt(i) == 'B' && place == 3) {
                place = 2;
            }
            else if(moves.charAt(i) == 'B' && place == 2) {
                place = 3;
            }
            else if(moves.charAt(i) == 'C' && place == 1) {
                place = 3;
            }
            else if(moves.charAt(i) == 'C' && place == 3) {
                place = 1;
            }

        }
        System.out.println(place);

    }
}