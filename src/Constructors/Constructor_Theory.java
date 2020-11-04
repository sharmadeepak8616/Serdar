package Constructors;

public class Constructor_Theory {
    /**
     * Constructor is a special method:
     *  1. it MUST have same name as of the class
     *  2. it cannot have a return type NOT even void
     *  3. Class object gets created by executing the Constructor method
     *  therefore, when we create an object of a class,
     *      the Constructor method executes AUTOMATICALLY.
     *
     * Other point:
     *  1. a class can have multiple Constructors
     *      Constructor Overloading
     *  2. Constructor can be parameterized
     *  In other words, Constructor can have arguments.
     *  3. a Constructor can be public, private and protected
     *  public -> can be accessed anywhere in project.
     *      we can create object of the class, any where in the project.
     *  protected -> can be accessed anywhere in the package.
     *      we can create object of the class, any where in the package as of the class.
     *  private -> cannot be accessed outside the class.
     *      we CANNOT create object of the class.
     *      --> all variables/method must be static in the class
     *  Eg: Math.java
     *
     */
    public static void main(String[] args) {

        Math.random();



    }
}
