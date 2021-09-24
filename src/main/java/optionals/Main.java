package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello test")
                .orElse("Default Values");
        System.out.println(value);

        Optional.ofNullable("null")
                .ifPresentOrElse(
                        email -> System.out.println("sending email to "+email),
                        () -> System.out.println("Cannot Send Email"));
    }
}
