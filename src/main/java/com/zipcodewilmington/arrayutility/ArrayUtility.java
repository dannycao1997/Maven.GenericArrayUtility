package com.zipcodewilmington.arrayutility;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 3/6/18.
 */

// https://www.geeksforgeeks.org/array-class-in-java/
// GENERICS ARRAY METHODS ^

public class ArrayUtility<T> { // generic class for array utility of type t elements
    private T[] inputArray; // input array

    public ArrayUtility(T[] inputArray) { // constructor to initialize the array to be used in methods
        this.inputArray = inputArray;
    }


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {

        // counting duplicates in input array
        long countInputArray = Arrays.stream(inputArray).filter(value -> value.equals(valueToEvaluate)).count();

        // counting duplicates in merge array
        long countMergeArray = Arrays.stream(arrayToMerge).filter(value -> value.equals(valueToEvaluate)).count();

        return (int) (countInputArray + countMergeArray); // returning sum of both
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {

        // sorting elements by frequency using java map
        Map<T, Integer> frequencyMap = new HashMap<>();

        // sorting elements to find more common from inputarray and arraytomerge
        Arrays.stream(inputArray).forEach(element -> frequencyMap.merge(element, 1, Integer::sum));
        Arrays.stream(arrayToMerge).forEach(element -> frequencyMap.merge(element, 1, Integer::sum));

        return frequencyMap.entrySet().stream() // returning most common aka element with high frequency
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {

        // using java stream to compare and count occurrences
        return (int) Arrays.stream(inputArray).filter(value -> value.equals(valueToEvaluate)).count();
    }

    public T[] removeValue(T valueToRemove) {

        // using java stream to compare and create a new array list to store value without valueToRemove
        T[] array = Arrays.stream(inputArray)

                .filter(element -> !element.equals(valueToRemove))
                .toArray(size -> (T[]) Array.newInstance(inputArray.getClass().getComponentType(), size));

        return array;
    }
}







