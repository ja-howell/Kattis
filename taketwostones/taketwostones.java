import java.util.Scanner;
public class taketwostones
{
    public static void main(String [] args)
    {
        Scanner scnr = new Scanner(System.in);

        int stones = scnr.nextInt();

        if(stones%2 != 0)
        {
            System.out.println("Alice");
        }
        else
        {
            System.out.println("Bob");
        }
    }

}
    