package Class4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHashMap {
    public static void main(String[] args) {

        /**
         * Map/HashMap
         *
         * Map is an Interface which extends Collection-Interface and being implemented by HashMap-Class
         *  It's datatype which stores a pair at every index.
         *      pair --> (key,value)
         *  It does NOT maintain the order of insertion
         *
         * {(key1,value), (key2,value), (key3,value), (key4,value), (key5,value)}
         * --> key is ALWAYS UNIQUE in a Map
         *
         * List/Set --> [val, val, val, val]
         *
         * Syntax to create Map/HashMap
         * HashMap<keyDataTypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         * -- OR --
         * Map<keyDataTypeClass, valueDatatypeClass> myMap = new HashMap<>();
         */

        Map<Integer, String> myMap = new HashMap<>();

        System.out.println("\nmyMap --> " + myMap);
        System.out.println("Length of myMap: " + myMap.size()); //0

        // to add pairs in HashMap
        myMap.put(100, "Happy");
        myMap.put(200, "very happy");
        myMap.put(300,"good");
        myMap.put(400, "study");
        myMap.put(100, "grow");
        myMap.put(150, "peace");
        myMap.put(1000, "stay healthy");
        myMap.put(2020, "covid19");

        System.out.println("\nmyMap --> " + myMap);
        System.out.println("Length of myMap: " + myMap.size());

        /**
         * remove
         *      when only the key is given
         *          if key found, the pair will be remove and returns the associated value
         *          else returns null
         *
         *       when key-value pair is given
         *          if pair is found, the pair will be removed and returns true
         *          else returns false
         */
        System.out.println("\nValue after removing pair with key-303: " + myMap.remove(303));
        System.out.println("Value after removing pair with key-2020: " + myMap.remove(2020));

        System.out.println("\nis (300,'Good') removed?: " + myMap.remove(300, "Good"));
        System.out.println("is (300,'good') removed?: " + myMap.remove(300, "good"));

        System.out.println("\nmyMap --> " + myMap);
        System.out.println("Length of myMap: " + myMap.size());

        /**
         * retrieve the value associated with a key
         * get() method
         *
         * if key is found, returns the associated value
         * else returns null
         */
        System.out.println("Value associated with key-200: " + myMap.get(200));
        System.out.println("Value associated with key-2020: " + myMap.get(2020));

        /**
         * to check if data is present as one of the keys in Map
         * containsKey()
         *
         * if the given data is present as one of the keys, returns true
         * else returns false
         */
        System.out.println("\nis there '792' as one of the keys?: " + myMap.containsKey(792));
        System.out.println("is there '400' as one of the keys?: " + myMap.containsKey(400));

        /**
         * to check if data is present as one of the values in Map
         * containsValue()
         *
         * if the given data is present as one of the values, returns true
         * else returns false
         */
        System.out.println("\nis 'Grow' present as one of the values?: " + myMap.containsValue("Grow"));
        System.out.println("is 'peace' present as one of the values?: " + myMap.containsValue("peace"));

        System.out.println("\nmyMap --> " + myMap);
        System.out.println("Length of myMap: " + myMap.size());

        /**
         * to get all the keys in a variable
         * keySet()
         *
         * returns a Set containing all keys from the Map
         *
         */
        Set<Integer> allKeys = myMap.keySet();
        System.out.println("\nAll keys: " + allKeys);

        /**
         * to get all the values in a variable
         * values()
         *
         * returns a Collection containing all values from the Map
         *
         */
        Collection<String> allValues = myMap.values();
        System.out.println("All values: " + allValues);

        /**
         * isEmpty
         *      if Map/HashMap empty, returns true
         *      else returns false
         */
        System.out.println("\nmyMap --> " + myMap);
        System.out.println("Length of myMap: " + myMap.size());
        System.out.println("is myMap empty?: " + myMap.isEmpty());

        /**
         * clear - to clear Map/HashMap
         */
        System.out.println("\nClearing myMap");
        myMap.clear();

        System.out.println("\nmyMap --> " + myMap);
        System.out.println("Length of myMap: " + myMap.size());
        System.out.println("is myMap empty?: " + myMap.isEmpty());

    }
}
