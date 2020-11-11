package Class2.Constructors2;

public class Customer {

    String name;
    int ssn;
    String city;
    double balance;

    public Customer(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public Customer(String name, int ssn, String city) {
        this.name = name;
        this.ssn = ssn;
        this.city = city;
    }


    public void customerProfile(String name, int ssn, String city) {
        this.name = name;
        this.ssn = ssn;
        this.city = city;
    }

    public void customerProfile(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public void updateCityName(String city) {
        this.city = city;
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        balance-=amount;
    }

    public void showCustomerSummary() {
        System.out.println("Name : " + name);
        System.out.println("SSN : " + ssn);
        if (city != null) {
            System.out.println("City : " + city);
        }
        System.out.println("Balance : " + balance);
    }



}
