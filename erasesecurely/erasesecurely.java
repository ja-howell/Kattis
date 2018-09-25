import java.util.Scanner;
public class erasesecurely{
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        int sweeps = scnr.nextInt();
        String startDrive = scnr.next();
        String endDrive = scnr.next();
        int i = 0;

        if(sweeps % 2 == 0){
            if(startDrive.equals(endDrive)){
                System.out.print("Deletion succeeded");
            }
            else {
                System.out.print("Deletion failed");
            }
        }
        else {
            while((i < startDrive.length()) && (startDrive.charAt(i) != endDrive.charAt(i))) {
                ++i;
            }
            if(i == startDrive.length()) {
                System.out.print("Deletion succeeded");
            }
            else {
                System.out.print("Deletion failed");
            }

        }
    }
}