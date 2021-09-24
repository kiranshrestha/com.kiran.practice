package funtionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5436/user";
    }

    static Supplier<List<String>> getDBConnectionSupplier = () -> List.of(
            "jdbc://localhost:5436/user",
            "jdbc://localhost:5436/customer",
            "jdbc://localhost:5436/phone"
            );

}
