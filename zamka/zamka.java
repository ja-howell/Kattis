import java.util.Scanner;
public class zamka{
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        int l = scnr.nextInt();
        int d = scnr.nextInt();
        int x = scnr.nextInt();
        int n = 0;
        int m = 0;
        int i = l;

        while(n == 0) {
            if((sumDigits(i) == x) && (n == 0)) {
                    n = i;
                }
            else {
                ++i;
            }
        }
        i = d;
        while(m == 0) {
            if((sumDigits(i) == x) && (m == 0)) {
                    m = i;
                }
            else {
                --i;
            }
        }
        // for(int i = d; i >=l; --i){
        //     if((sumDigits(i) == x) && (m == 0)) {
        //         m = i; 
        //     }
       // }
    
        System.out.println(n);
        System.out.println(m);
            
    }
    public static int sumDigits(int num) {
        int total = 0;

        while(num > 0){
            total += num % 10;
            num = num/10;
        }
        return total;
    }
}