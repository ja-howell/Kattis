import java.util.Scanner;
public class batterup
{
    public static void main(String [] args)
    {
        Scanner scnr = new Scanner(System.in);

        int atBats = scnr.nextInt();
        int basesTaken = 0;
        int totalBases = 0;
        double avg = 0;
        int walks = 0;

        for(int i = 0; i < atBats; i++)
        {
            basesTaken = scnr.nextInt();
            if(basesTaken >= 0)
            {
                totalBases = basesTaken + totalBases;
            }
            else
            {
                walks++;
            }

        }
        avg = (double)totalBases / (atBats - walks);
        System.out.println(avg);

        scnr.close();
    }
}