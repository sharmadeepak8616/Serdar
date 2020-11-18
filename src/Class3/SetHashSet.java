package Class3;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet {
    public static void main(String[] args) {

        /**
         *
         * Set/HashSet
         *   Set is an Interface which extends Collection-Interface, and being implemented by HashSet-Class
         *   It's a datatype which can store multiple values.
         *   It does NOT maintain the order of insertion
         *   It does NOT store duplicate values.
         *
         * Hashing:
         * It's a technique to store data in memory to use the memory in most efficient way.
         *
         *
         * Syntax to create HashSet:
         * HashSet<datatypeClass> myHashSet = new HashSet();
         * -- OR --
         * Set<datatypeClass> mySet = new HashSet<>();
         *
         * mySet.add(10);
         *
         * mySet.add(2000);
         *
         * mySet.add(1);
         *
         *
         *
         */

        Set<String> mySet = new HashSet<>();

        System.out.println("\nmySet: " + mySet);
        System.out.println("Length of mySet: " + mySet.size());

        mySet.add("happy");
        mySet.add("laugh");
        mySet.add("happy");
        mySet.add("study");
        mySet.add("learn");
        mySet.add("grow");

        System.out.println("\nmySet: " + mySet);
        System.out.println("Length of mySet: " + mySet.size());

        /**
         * remove
         *   when use with value
         *      if value is found (first occurrence) -> returns true
         *      else -> false
         *
         */
        System.out.println("\nRemoved 'study' from mySet?: " + mySet.remove("study"));

        System.out.println("\nmySet: " + mySet);
        System.out.println("Length of mySet: " + mySet.size());

        /**
         * contains - to find if the given value is present in Set/HashSet or not
         *      if the given value found -> returns true
         *      else -> false
         */
        System.out.println("\nis 'happy' present in mySet?: " + mySet.contains("happy"));
        System.out.println("is 'Rock' present in mySet?: " + mySet.contains("Rock"));

        System.out.println("\nmySet: " + mySet);
        System.out.println("Length of mySet: " + mySet.size());

        /**
         * isEmpty
         *      if Set/HashSet is empty -> return is true
         *      else -> false
         */
        System.out.println("\nis mySet empty?: " + mySet.isEmpty());
        System.out.println("mySet: " + mySet);
        System.out.println("Length of mySet: " + mySet.size());


        /**
         * clear - To empty Set/HashSet
         */
        System.out.println("\nClearing mySet starts");
        mySet.clear();
        System.out.println("Clearing mySet ends");

        System.out.println("\nis mySet empty?: " + mySet.isEmpty());
        System.out.println("mySet: " + mySet);
        System.out.println("Length of mySet: " + mySet.size());
    }
}
