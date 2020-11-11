package Class2.Constructors2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        /**
         * 1. Create customer object
         * 2. Submit your profile (enter name, ssn and city-optional)
         * 3. start banking
         * 4. view summary when ever you want
         */

        List<Customer> allCustomers = new ArrayList<>();

        Customer c1 = new Customer("c1", 1111, "New York");
        // c1.customerProfile("c1", 1111, "new york");
        allCustomers.add(c1);

        Customer c2 = new Customer("c2", 2222);
        // c2.customerProfile("c2", 2222);
        allCustomers.add(c2);

        c1.deposit(1000);

        c2.deposit(2000);

        c1.withdraw(100);

        c2.withdraw(200);

        c2.showCustomerSummary();   // c2, 2222, 1800

        c1.showCustomerSummary();   // c1, 1111, new york, 900

        Customer c3 = new Customer("c3", 3333);
        allCustomers.add(c3);
        c3.deposit(300);
        c3.showCustomerSummary();

        System.out.println("Bank total customer count: " + allCustomers.size());








    }
}
