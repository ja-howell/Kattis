import java.util.Scanner;

public class speedlimit {

    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        int pairs;
        int hoursTraveled;
        int pointInTime;
        int speed;
        int totalMiles;

        pairs = kb.nextInt();
        while(pairs != -1) {
            hoursTraveled = 0;
            totalMiles = 0;
            for(int i = 0; i < pairs; i++) {
                speed = kb.nextInt();
                pointInTime = kb.nextInt();
                
                // int timeElapsed = pointInTime - hoursTraveled;
                // int miles = timeElapsed * speed;
                totalMiles += speed * (pointInTime - hoursTraveled);
                hoursTraveled = pointInTime; 

            }
            System.out.println(totalMiles + " miles");
            pairs = kb.nextInt();
        }
    }
}