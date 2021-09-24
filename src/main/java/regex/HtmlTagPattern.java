package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HtmlTagPattern {

    public static void main(String[] args) {
        Regex_Test test = new Regex_Test();
        test.checker("<a\\shref=\"([^\"]++)\"([^<>]*)>(<\\w>)*([^<>]*)<");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }
}

class Regex_Test{

    public void checker(String Regex_Pattern){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        while (num>0){
            String testString = input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(testString);
            while(m.find()){
                System.out.println(m.group(1).trim()+","+m.group(4).trim());
            }
            num--;
        }

    }

}

