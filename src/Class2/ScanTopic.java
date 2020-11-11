package Class2;

import java.util.Scanner;

public class ScanTopic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your lucky number: ");
        int num = input.nextInt();  // a  -->  Exception
        System.out.println("You entered: " + num);

        System.out.println("Please neter your name:");
        String name = input.next(); // "10"
        System.out.println("Your name: " + name.toUpperCase());





    }
}
