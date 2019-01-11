import java.util.Scanner;

public class oddities{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int tests;
        int num;

        tests = kb.nextInt();
        for(int i = 0; i < tests; i++){
            num = kb.nextInt();

            if(num % 2 == 0){
                System.out.printf("%d is even\n", num);
            }
            else{
                System.out.printf("%d is odd\n", num);
            }
        }
    }
}