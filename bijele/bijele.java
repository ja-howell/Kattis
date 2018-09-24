import java.util.Scanner;
public class bijele {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int[] totalPieces = new int[6];

        totalPieces[0] = scnr.nextInt();
        totalPieces[1] = scnr.nextInt();
        totalPieces[2] = scnr.nextInt();
        totalPieces[3] = scnr.nextInt();
        totalPieces[4] = scnr.nextInt();
        totalPieces[5] = scnr.nextInt();
        int queens = 0;
        int kings = 0;
        int rooks = 0;
        int bishops = 0;
        int knights = 0;
        int pawns = 0;

        if(totalPieces[0] < 1) {
            queens = 1;
        }
        else if(totalPieces[0] > 1){
            while(totalPieces[0]>1) {
            queens = queens -1;
            --totalPieces[0];
            }
        }
        if(totalPieces[1] < 1) {
            kings = 1;
        }
        else if(totalPieces[1] > 1){
            while(totalPieces[1]>1) {
            kings = kings -1;
            --totalPieces[1];
            }
        }
        if(totalPieces[2] < 2) {
            while(totalPieces[2] < 2){
                rooks = rooks + 1;
                ++totalPieces[2];
            }
        }
        else if(totalPieces[2] > 2){
            while(totalPieces[2] > 2) {
            rooks = rooks -1;
            --totalPieces[2];
            }
        }
        
        if(totalPieces[3] < 2) {
            while(totalPieces[3] < 2){
                bishops = bishops + 1;
                ++totalPieces[3];
            }
        }
        else if(totalPieces[3] > 2){
            while(totalPieces[3] > 2) {
            bishops = bishops -1;
            --totalPieces[3];
            }
        }
        
        if(totalPieces[4] < 2) {
            while(totalPieces[4] < 2){
                knights = knights + 1;
                ++totalPieces[4];
            }
        }
        else if(totalPieces[4] > 2){
            while(totalPieces[4] > 2) {
            knights = knights -1;
            --totalPieces[4];
            }
        }
        
        if(totalPieces[5] < 8) {
            while(totalPieces[5] < 8){
                pawns = pawns + 1;
                ++totalPieces[5];
            }
        }
        else if(totalPieces[5] > 8){
            while(totalPieces[5] > 8) {
            pawns = pawns -1;
            --totalPieces[5];
            }
        }

        System.out.printf("%d %d %d %d %d %d", queens, kings, rooks, bishops, knights, pawns);


    }
}