package practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        checkTheCode("hello");
    }
    public static void checkTheCode (String input) {
        boolean result = Boolean.parseBoolean(input);
        result = !result;
        String output = String.valueOf(result);
        System.out.println(output);
        ArrayIndexOutOfBoundsException
    }
}
