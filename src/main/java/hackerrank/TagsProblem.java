package hackerrank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagsProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.nextLine();
        for (int i = 0 ; i<=num ; i++){
            printStringBetweenTag(s.nextLine());
        }
        s.close();
    }

    private static void printStringBetweenTag(String s) {
        System.out.println(s);
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(s);
        boolean matchFound = false;
        while (m.find()) {
            System.out.println(m.group(2));
            matchFound = true;
        }
        if ( ! matchFound) {
            System.out.println("None");
        }
    }
}


