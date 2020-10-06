package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){

        Integer numOfDuplicateEntries = 0;
        Map<String, Integer> hashMap = new HashMap<>();

        for (String strElement : input) {
            if (!hashMap.containsKey(strElement)) {
                hashMap.put(strElement, 1);
            }
            else {
                hashMap.put(strElement, hashMap.get(strElement) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                numOfDuplicateEntries++;
            }
        }
        return numOfDuplicateEntries;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){

        Integer numOfDuplicateEntries = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (Integer intElement: input) {
            if (!hashMap.containsKey(intElement)) {
                hashMap.put(intElement, 1);
            }
            else if (hashMap.containsKey(intElement)) {
                hashMap.put(intElement,hashMap.get(intElement) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                numOfDuplicateEntries++;
            }
        }
        return numOfDuplicateEntries;
    }
}
