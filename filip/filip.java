import java.util.Scanner;
public class filip{

    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
       
        if(num1 % 10 == num2 % 10) {
            if(num1 % 100 == num2 % 100){
                if(num1 % 1000 > num2 % 1000){
                    printReverseNumber(num1);  
                }
                else {
                    printReverseNumber(num2);
                }
            }
            else if( num1 % 100 > num2 % 100) {
                printReverseNumber(num1);
            }
            else {
                printReverseNumber(num2);
            }
        }
        else if(num1 % 10 > num2 % 10){
            printReverseNumber(num1);
        }
        else {
            printReverseNumber(num2);
        }
    }
    public static void printReverseNumber(int numFinal){
        while(numFinal > 0){
            System.out.print(numFinal % 10);
            numFinal /= 10;
        }
    }
}