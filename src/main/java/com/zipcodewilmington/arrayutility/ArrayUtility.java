package com.zipcodewilmington.arrayutility;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> { // generic array setup
    T[] inputArray; // inputArray with Type T elements
    public ArrayUtility(T[] inputArray) { // constructor
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int counter = 0;
        List<T> arrayList = new ArrayList<>(Arrays.asList(inputArray));
        arrayList.addAll(Arrays.asList(arrayToMerge));

        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int counter = 0;
        for(int i = 0; i < this.inputArray.length; i++){
            if(this.inputArray[i] == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

}








