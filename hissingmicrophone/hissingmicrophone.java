import java.util.Scanner;
public class hissingmicrophone {

    public static void main(String [] args) {
    
        Scanner scnr = new Scanner(System.in);

        int wordIndex = 0;
        String userWord = scnr.next();

        wordIndex = userWord.indexOf("ss");

        if(wordIndex == -1) {
            System.out.println("no hiss");
        }
        else {
            System.out.println("hiss");
        }
        
    }
}

