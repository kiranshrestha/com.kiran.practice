package upgrad;


import java.util.*;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.

    int getSuitPriority() {
        int priority;
        //Write your code here.
        switch (suit) {
            case "Spades" : priority = 4;
            break;
            case "Diamond" : priority = 3;
            break;
            case "Hearts" : priority = 2;
            break;
            case "club" : priority = 1;
            break;
            default : priority = 0;
        }
        return priority;
    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.
        if(c1.value == c2.value){
            if(c1.getSuitPriority()>c2.getSuitPriority())
            {
                points1++;
            }else {
                points2++;
            }
        }else if(c1.value > c2.value)
            points1++;
        else
            points2++;
        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}


public class CardApp {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}
