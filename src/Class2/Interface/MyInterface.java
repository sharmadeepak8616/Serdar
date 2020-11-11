package Class2.Interface;

public interface MyInterface {

    /**
     * 1. Interface look like a class
     * 2. Interface can contain only Abstract methods.
     * 3. By default, all method in the interface are Abstract method
     *      (Abstract Method -> Method with only signature, no body)
     * 4. We cannot create Object of an Interface,
     *      BUT we can create variable of Interface type
     * 5. A class can implement one or more interface.
     *      when a class implements an Interface, means in the class.
     *      we give body to all abstract methods mentioned in Interface.
     * 6. By default, all variables are static and final in Interface.
     * 7. an Interface can extend another Interface.
     * 8. In the Interface, we can create methods with body but they will be static.
     *
     *      Interface1
     *
     *      Interface2 extends Interface1
     *
     *      public class MyClass implements Interface2
     *          // Inside MyClass, user has to give body to
     *          // all abstract methods from Interface2 and Interface1
     */

    public void displayFullName(String fname, String lname);

    public int addTwoIntNumbers(int num1, int num2);


    public static void abc() {
        System.out.println("hello");
    }

    public static void abc(String name) {
        System.out.println("hello " + name);
    }




}
