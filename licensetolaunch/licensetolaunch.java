import java.util.Scanner;

public class licensetolaunch{
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int days;
        int junk;
        int leastJunk = -1;
        int launchDay = 0;

        days = kb.nextInt();
        for(int i = 0; i < days; i++){
            junk = kb.nextInt();
            if(leastJunk == -1 || leastJunk > junk) {
                leastJunk = junk;
                launchDay = i;
            } 
        }
        System.out.println(launchDay);
    }
}