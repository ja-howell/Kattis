import java.util.Scanner;

public class cursethedarkness {
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
        double xBook, yBook, xCandle, yCandle, distance;
        int testCases, candles;
        boolean light;

        testCases = kb.nextInt();

        for(int i = 0; i < testCases; ++i) {
            light = false;
            xBook = kb.nextDouble();
            yBook = kb.nextDouble();
            candles = kb.nextInt();
            for(int j = 0; j < candles; ++j) {
                xCandle = kb.nextDouble();
                yCandle = kb.nextDouble();
                    

                if(getDistance(xBook, xCandle, yBook, yCandle) <= 8) {
                    light = true;
                }
            }
            if(light == true) {
                System.out.println("light a candle");
            }
            else {
                System.out.println("curse the darkness");
            }
        }
    }
    
    public static double getDistance(double x1, double x2, double y1, double y2) {
        double distance = 0.0;
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distance;
    }
}