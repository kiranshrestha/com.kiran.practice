package funtionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer kiran_shrestha = new Customer("Kiran Shrestha", "8057163350");
        //Normal java function
        greetCustomer(kiran_shrestha);
        //Consumer Functional Interface
        greetCustomerConsumer.accept(kiran_shrestha);
        greetCustomerConsumerV2.accept(kiran_shrestha,false);
    }
    static class Customer{
        private final String customerName;
        private final String customerCustomerPhoneNumber;

        public Customer(String customerName, String customerCustomerPhoneNumber) {
            this.customerName = customerName;
            this.customerCustomerPhoneNumber = customerCustomerPhoneNumber;
        }
    }
    static void greetCustomer(Customer customer){
        System.out.printf("Hello %s, thanks for registering phone number %s",customer.customerName,customer.customerCustomerPhoneNumber);
        System.out.println();
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.printf("Hello %s, thanks for registering phone number %s",customer.customerName,customer.customerCustomerPhoneNumber);
        System.out.println();
    };
    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer,showPhoneNo) -> System.out.println("Hello " + customer.customerName +", thanks for registering phone number "+ (showPhoneNo?customer.customerCustomerPhoneNumber:"**********"));
}

