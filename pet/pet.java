import java.util.Scanner;

public class pet{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int contestant = 1;
        int score = 0;
        int topScore = 0;
        int topCon = 0;

        for(int i = 0; i < 5; ++i){
            for(int j = 0; j < 4; ++j){
                score += kb.nextInt();
            }
            if(score > topScore){
                topScore = score;
                topCon = contestant;
            }
            contestant++;
            score = 0;
        }
        System.out.println(topCon + " " + topScore);
    } 
}