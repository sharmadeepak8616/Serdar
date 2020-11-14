package Class3;

import java.util.ArrayList;
import java.util.List;

public class ListArraylist {
    public static void main(String[] args) {

        /**
         * Collection(I):
         *
         *      List(I):
         *          ArrayList(C)    <-- ArrayList(C) implements List(I); List(I) extends Collection(I)
         *          LinkedList(C)
         *          Vector(C)
         *
         *      Set(I):
         *          HashSet(C)      <-- HashSet(C) implements Set(I); Set(I) extends Collection(I)
         *          LinkedHashSet(C)
         *          TreeSet(C)
         *
         *      Map(I):
         *          HashMap(C)      <-- HashMap(C) implements Map(I); Map(I) extends Collection(I)
         *          LinkedHashMap(C)
         *          TreeMap(C)
         *
         */

        /**
         *  Limitations of Array:
         *
         *  1. while creating the array,
         *      either user should know the number of values that are going to be stored in the array.
         *          eg: int[] arrInt = new int[5];      // 5 values are going to be stored
         *      or, all the values that are going to be stored in the array.
         *          eg: String[] names = {"happy", "peace", "laugh", "grow"};
         *
         *  2. the array has fixed length.
         *
         *  3. array can store values of SAME datatype.
         *
         */
        /**
         * List/ArrayList:
         *  List is an Interface which extends Collection-Interface and being implemented by ArrayList-Class
         *  It's a datatype which can store multiple values.
         *  It maintains the order of insertion.
         *
         * Syntax to create ArrayList:
         *
         * ArrayList<datatypeClass> myArrList = new ArrayList<>();
         *  -- OR --
         * List<datatypeClass> myList = new ArrayList<>();
         *
         * int -> Integer
         * double -> Double
         * String -> String
         * char -> Character
         * boolean -> Boolean
         *
         * eg:
         * Create an arrayList to store int values
         * List<Integer> myIntList = new ArrayList<>();     // []
         *
         * myIntList.add(10);   // [10]
         *
         * myIntList.add(87);   // [10, 87]
         *
         * myIntList.add(32);   // [10, 87, 32]
         *
         * sout(myIntList);     // [10, 87, 32]
         */

        List<String> names = new ArrayList<>();

        System.out.println("\nNames: " + names);

        // to find the length of List/ArrayList
        System.out.println("Length of names arrayList: " + names.size());   // 0

        names.add("happy");
        names.add("laugh");
        names.add("JOy");
        names.add("happy");
        names.add("proper");
        names.add("JOY");
        names.add("laugh");
        names.add("understand");
        names.add("JOy");
        names.add("learn");
        names.add("grow");
        names.add("laugh");
        names.add("understand");
        names.add("JOy");

        System.out.println("\nNames: " + names);
        System.out.println("Length of names arrayList: " + names.size());   // 5

        /**
         *
         * remove
         *      when use with index-value
         *          if index is found -> returns the removedValue
         *          else -> IndexOutOfBoundsException
         *      when use with value
         *          if value is found (first occurrence) -> returns true
         *          else -> false
         *
         */
        System.out.println("\nRemoved value from index-1: " + names.remove(1));
        System.out.println("Removed 'happy' from names: " + names.remove("happy"));
        System.out.println("Removed 'Happy' from names: " + names.remove("Happy"));

        System.out.println("\nNames: " + names);
        System.out.println("Length of names arrayList: " + names.size());

        /**
         * set  -   user can use to replace the value at specific index
         *      if index is found -> replaces the value ans returns the old value
         *      else -> IndexOutOfBoundsException
         */
        System.out.println("\nAfter replacing index-1 value with 'Rock': " + names.set(1, "Rock"));

        System.out.println("\nNames: " + names);
        System.out.println("Length of names arrayList: " + names.size());

        /**
         *  indexOf - to find the index of given value
         *      if the value is found -> returns the index of FIRST OCCURRENCE of the give value
         *      else -> -1
         */
        System.out.println("\nIndex of 'JOy': " + names.indexOf("JOy"));       // 0
        System.out.println("Index of 'Happy': " + names.indexOf("Happy"));      // -1
        System.out.println("Index of 'Laugh': " + names.indexOf("Laugh"));      // -1

        /**
         *  lastIndexOf - to find the index of given value
         *      if the value is found -> returns the index of LAST OCCURRENCE of the give value
         *      else -> -1
         */
        System.out.println("\nIndex of 'laugh': " + names.lastIndexOf("laugh"));     // 9
        System.out.println("Index of 'Happy': " + names.lastIndexOf("Happy"));      // -1
        System.out.println("Index of 'Laugh': " + names.lastIndexOf("Laugh"));      // -1

        System.out.println("\nNames: " + names);
        System.out.println("Length of names arrayList: " + names.size());

        /**
         * contains - to find if the given value is present in ArrayList or not
         *      if the given value found -> returns true
         *      else -> false
         *
         */
        System.out.println("\nis 'happy' present in names?: " + names.contains("happy"));
        System.out.println("is 'JOy' present in names?: " + names.contains("JOy"));
        System.out.println("is 'Laugh' present in names?: " + names.contains("Laugh"));


        /**
         * isEmpty
         *      if arrayList is empty -> return is true
         *      else -> false
         */
        System.out.println("\nis names empty?: " + names.isEmpty());
        System.out.println("Names: " + names);
        System.out.println("Length of names arrayList: " + names.size());


        /**
         * clear - To empty ArrayList
         */
        System.out.println("\nClearing Array list starts");
        names.clear();
        System.out.println("Clearing Array list ends");


        System.out.println("\nis names empty?: " + names.isEmpty());
        System.out.println("Names: " + names);
        System.out.println("Length of names arrayList: " + names.size());

    }
}
