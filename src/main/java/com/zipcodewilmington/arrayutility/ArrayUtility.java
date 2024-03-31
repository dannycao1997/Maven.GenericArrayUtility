package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> { // generic array setup
    T[] inputArray; // inputArray with Type T elements
    public ArrayUtility(T[] inputArray) { // constructor
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        ArrayUtility<T> mergedUtility = new ArrayUtility<>(mergeArrays(arrayToMerge));
        return;
    }




