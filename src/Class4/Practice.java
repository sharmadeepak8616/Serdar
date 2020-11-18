package Class4;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        /**
         * Student1 - 100, 98, 99, 78, 90
         * Student2 - 90, 99, 98, 98, 89
         * Student3 - 90, 90, 99, 89, 70
         * Student4 - 88, 87, 99, 98, 70
         * Student5 - 90, 92, 84, 90, 70
         *
         *
         * (String, Integer[])
         *
         * (String, List<Integer>)
         *
         */

        Map<String,Integer[]> scores = new HashMap<>();
        Integer[] score = {100, 98, 99, 78, 90};
        String studentName = "Student1";
        scores.put(studentName, score);
        System.out.println(scores);

        List<Integer> studentScore = Arrays.asList(score);

        Map<String, List<Integer>> scores2 = new HashMap<>();
        scores2.put(studentName, studentScore);

        System.out.println(scores2);

        // print the value associated with key-Student1
        List<Integer> student1Values = scores2.get("Student1");
        System.out.println("Student1 values --> " + student1Values);



        /**
         * Student1 - 100, 98, 99, 78, 90   495
         * Student2 - 90, 99, 98, 98, 89    489
         * Student3 - 90, 90, 99, 89, 70    470
         * Student4 - 88, 87, 99, 98, 70    498
         * Student5 - 90, 92, 84, 90, 70    482
         *
         * Tell me name of student who scored maximum marks
         *
         * 1. get all data in Map (String, List<Integer>)
         * 2. sum all values for every student
         * 3. Store total in Map (String, Integer)
         *      {(Student1, 495) , (Student2, 489), (Student3, 470) , (Student4, 498), (Student5, 482)}
         * 4. using values() --> [495, 489, 470, 498, 482]
         * 5. find the maximum value --> int maxScore = 498
         * 6. using for-loop, i'll find the name of student got highest score
         *
         *
         * Set<String> names = scores2.keySet();    // [Student2, Student4, Student1, Student5, Student3]
         * for (String name : names) {
         *      int score = scores2.get(name);
         *      if (score == maxScore) {
         *          sout(name + "got the highest score");
         *          break;
         *      }
         * }
         *
         *
         */

        /**
         *
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value, else "All keys have different values"
         *
         * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
         * Output (print) ->
         *      "happy" with keys -> 101, 103, 106
         *      "peace" with keys -> 102, 105
         *
         * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
         * Output (print) ->
         *      All keys have different values
         *
         *
         */

        /**
         * Create a method, that will RETURN all duplicate values with count from the given List<String>
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "HappY", "laugh", "joy"};
         *
         * Use method to get the duplicate values with count, store the returned-value in a variable (result).
         * Then print the data in side the variable in below format:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         */

        String[] myList1 = {"happy", "peace", "joy", "grow", "joy", "laugh", "HappY", "laugh", "joy"};
        checkForDuplicates(myList1);

    }

    public static void checkForDuplicates(String[] myArray){
        Map<String,Integer> myList = new HashMap<>();
        for (int i=0; i<myArray.length; i++) {
            String val = myArray[i].toLowerCase();
            if(!myList.containsKey(val)){
                myList.put(val, 1);
            }else{
                myList.put(val, myList.get(val)+1);
            }
        }
        for(String nap:myList.keySet()){
            if (myList.get(nap)>1) {
                System.out.println(nap + " = " + myList.get(nap));
            }
        }
    }
}
