package funtionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(5);
        System.out.println(increment2 );

        int multiply = multiplyByTen.apply(increment2);
        System.out.println(multiply);

        Function<Integer,Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTen);

        Integer addNMultiply = addBy1AndThenMultiplyBy10.apply(6);
        System.out.println(addNMultiply );

        System.out.println("BiFunctions");
        System.out.println("Normal Types");
        System.out.println(incrementByOneAndThenMultiply(10,14));
        System.out.println("Functional Types");
        System.out.println(incrementByOneAndThenMultiplyBiFunction.apply(10,14));
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer,Integer> multiplyByTen = number -> number * 10;

    static int incrementByOne(int number){
        return number+1;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndThenMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne +1) * numberToMultiplyBy;

    static int incrementByOneAndThenMultiply(int number,int numToMultiplyBy){
        return (number+1) * numToMultiplyBy;
    }
}
