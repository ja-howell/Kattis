import java.util.Scanner;
public class solvingforcarrots
{
    public static void main(String [] args)
    {
        Scanner scnr = new Scanner(System.in);

        int players;
        int huffProblems;
        String playerBio;

        players = scnr.nextInt();
        huffProblems = scnr.nextInt();

        while(players > 0)
        {
        playerBio = scnr.next();
        players = players - 1;
        }
        System.out.println(huffProblems);
    }

}

