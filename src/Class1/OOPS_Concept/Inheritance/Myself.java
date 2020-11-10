package Class1.OOPS_Concept.Inheritance;

public class Myself extends MyParent {

    public Myself() {
        System.out.println("Myself Constructor");
    }

    String myStatement = "I am myself";

    public void myselfMethod() {
        System.out.println("Inside Myself method");
    }

    public void myselfMethod2() {
        myselfMethod();
        parentMethod();
        super.commonMethod(); // call parent commonMethod here.
    }

    public void commonMethod() {
        System.out.println("Inside common Myself method");
    }

    public void add(int num1, int num2) {
        System.out.println(num1+num2);
    }

    public void add(int num1, int num2, int num3) {
        System.out.println(num1+num2+num3);
    }

    public void add(double num1, int num2) {
        System.out.println(num1+num2);
    }

    public void add(int num1, double num2) {
        System.out.println(num1+num2);
    }



}
