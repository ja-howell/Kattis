import java.util.Scanner;

public class spavanac{
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int hour;
        int minute;

        hour = kb.nextInt();
        minute = kb.nextInt();

        minute = minute - 45;
        if(minute < 0) {
            hour -= 1;
            minute = minute + 60;
            if(hour < 0) {
                hour = hour + 24;
            }
        }
        System.out.printf("%d %d\n", hour, minute);
        

    }
}