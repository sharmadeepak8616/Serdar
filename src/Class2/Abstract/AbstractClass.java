package Class2.Abstract;

public abstract class AbstractClass {
    /**
     * 1. It's a class (we need to use abstract keyword to create abstract class)
     * 2. Abstract class can contain abstract method
     *      as well as normal methods (methods with body)
     * 3. By default, all methods are normal method.
     *      we need to use 'abstract' keyword to create abstract method.
     * 4. We cannot create Object of an Abstract class
     *      BUT we can create variable of AbstractClass type.
     * 5. To give body to Abstract methods in Abstract class,
     *      A class needs to extend the Abstract class
     *
     *
     */

    public abstract void sayBye();

    public void sayHello() {
        System.out.println("Hello");
    }
}
