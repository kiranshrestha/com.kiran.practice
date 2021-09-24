package funtionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07565456465"));
        System.out.println(isPhoneNumberValid("075654564654"));
        System.out.println(isPhoneNumberValid("07565456445564645"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07565456465"));
        System.out.println(isPhoneNumberValidPredicate.test("075654564654"));
        System.out.println(isPhoneNumberValidPredicate.test("07565456445564645"));

        System.out.println("Is Phone Number valid and contains number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("07565456465"));
        System.out.println("Is Phone Number valid and contains number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("07565453465"));
        System.out.println("Is Phone Number valid and contains number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("075654564654"));
        System.out.println("Is Phone Number valid and contains number 3 = " + isPhoneNumberValidPredicate.and(containsNumber3).test("07565456445564645"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->  phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
