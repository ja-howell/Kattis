import java.util.Scanner;

public class pokerhand{
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int[] cards = new int[13];
        String temp;
        int largest = 0;

        for(int i = 0; i < 5; i++) {
            temp = kb.next();
            char rank = temp.charAt(0);
            switch(rank){
                case 'A':
                    cards[0]++;
                    break;
                case 'T':
                    cards[9]++;
                    break;
                case 'J':
                    cards[10]++;
                    break;
                case 'Q':
                    cards[11]++;
                    break;
                case 'K':
                    cards[12]++;
                    break;
                default:
                    int n = Integer.parseInt(String.valueOf(rank));
                    cards[n-1]++;
            } 
        }
        for(int i = 0; i < 13; i++) {
            if(cards[i] > largest) {
                largest = cards[i];
            }
        }
        System.out.println(largest);
    }
}