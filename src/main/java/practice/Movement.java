package practice;

import java.util.Scanner;

public class Movement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        String out = "";
        switch (in){
            case 1 : out = "move up";
            break;
            case 2 : out = "move down";
                break;
            case 3 : out = "move left";
                break;
            case 4 : out = "move right";
                break;
            default: out ="error!";
        }
        System.out.println(out);
    }
}
