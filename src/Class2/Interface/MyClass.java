package Class2.Interface;

public class MyClass implements Interface2 {

    @Override
    public int multiple(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello Dear");
    }

    @Override
    public void displayFullName(String fname, String lname) {
        System.out.println(fname + " " + lname);
    }

    @Override
    public int addTwoIntNumbers(int num1, int num2) {
        return num1+num2;
    }
}
