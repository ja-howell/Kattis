import java.util.Scanner;

public class yoda
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        String temp1 = "";
        String temp2 = "";
        String num1AsString = Integer.toString(num1);
        String num2AsString = Integer.toString(num2);
        String longest, shortest;
        
        if (num1AsString.length() >= num2AsString.length()) {
            longest = num1AsString;
            shortest = num2AsString;
        }
        else {
            longest = num2AsString;
            shortest = num1AsString;
        }

        int lengthDifference = longest.length() - shortest.length();

        for (int i = 0; i < longest.length(); i++) {
            if (i < lengthDifference) {
                temp1 += longest.charAt(i);
                // System.out.println(temp1);
            }
            else if (longest.charAt(i) > shortest.charAt(i - lengthDifference)) {
                temp1 += longest.charAt(i);
            }
            else if (shortest.charAt(i - lengthDifference) > longest.charAt(i)) {
                temp2 += shortest.charAt(i - lengthDifference);
            }
            else {
                temp1 += longest.charAt(i);
                temp2 += shortest.charAt(i - lengthDifference);
            }
        }

        String first;
        String second;
        if (num1AsString.length() >= num2AsString.length()) {
            first = temp1;
            second = temp2;
        }
        else {
            first = temp2;
            second = temp1;
        }
        
        if (first.isEmpty()) {
            System.out.println("YODA");
        }
        else {
            System.out.println(Integer.parseInt(first));
        }

        if (second.isEmpty()) {
            System.out.println("YODA");
        }
        else {
            System.out.println(Integer.parseInt(second));
        }

    }

}