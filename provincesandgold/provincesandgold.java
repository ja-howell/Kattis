import java.util.Scanner;

public class provincesandgold{
    public static void main(String [] args){
//There are 3 kinds of victory cards in Dominion:
// Province (costs 8, worth 6 victory points)
// Duchy (costs 5, worth 3 victory points)
// Estate (costs 2, worth 1 victory point)
// And, there are 3 kinds of treasure cards:
// Gold (costs 6, worth 3 buying power)
// Silver (costs 3, worth 2 buying power)
// Copper (costs 0, worth 1 buying power)
    Scanner kb = new Scanner(System.in);
    String victoryCard;
    String treasureCard;
    int numGold = kb.nextInt();
    int numSilver = kb.nextInt();
    int numCopper = kb.nextInt();
    int buyingPower = (numGold*3 + numSilver*2 + numCopper);

    victoryCard = findVictoryCard(buyingPower);
    treasureCard = findTreasureCard(buyingPower);

    if(buyingPower >= 2){
        System.out.printf("%s or %s\n", victoryCard, treasureCard);
    }
    else{
        System.out.println(treasureCard);
    }
    }

    public static String findVictoryCard(int bp){
        String vc = "";
        if(bp >= 8){
            vc = "Province";
        }
        else if(bp >= 5){
            vc = "Duchy";
        }
        else if(bp >= 2){
            vc = "Estate";
        }
        else{
            vc = "";
        }

        return vc;
    }
    public static String findTreasureCard(int bp){
        String tc = "";
        if(bp >= 6){
            tc = "Gold";
        }
        else if(bp >= 3){
            tc = "Silver";
        }
        else{
            tc = "Copper";
        }

        return tc;
    }
}
