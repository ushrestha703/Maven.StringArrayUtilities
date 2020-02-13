package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] array1 = new String[array.length];

        for (int i = 0; i < array.length; i++)
        {
            array1[i] = array[array.length - 1 - i];
        }
        return array1;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        int j = array.length-1;

        for ( int i = 0; i < array.length / 2 ; i++) {
            if (!array[i].equals(array[j])) {
                return false;
            }
            j--;
        }
            return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        //String s = "";
        boolean result = true;
        int count = 0;

        // Need to work on this more. Need to make sure we loop all the alphabets.
        // for (int j = 0; j < array.length; j++)
        // {
        //   s += array[j];
        // }

        for (int i = 0; i < array.length;  i++) {
            if (array[i].contains("z") || array[i].contains("Z")) {

                count++;
            }
        }
        if (count == 0) {
            result = false;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {


            if (array == null) {
                return null;
            } else if (array.length <= 0) {
                return array;
            } else {
                String[] output = new String[array.length - 1];
                int count = 0;
                for (String i : array) {
                    if (!i.equals(valueToRemove)) {
                        output[count++] = i;
                    }
                }
                return output;
            }
        }

        //List<String> list = new ArrayList<String>(Arrays.asList(array));
        //list.remove(valueToRemove);
        //array = list.toArray(new String[0]);
       // return array;


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> aList = new ArrayList();

        for (int i = 0; i < array.length - 1; i++)
        {
            if (!array[i].equals(array[i + 1])) {
                aList.add(array[i]);
            }
        }
        aList.add(array[array.length-1]);
        return aList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String> aList = new ArrayList();
            int count = 0;
            //String temp = "";
            String temp = array[0];
            aList.add(temp);

        for (int i = 1; i < array.length ; i++) {
            if (!array[i].equals(temp)) {

                temp = array[i];
                aList.add(array[i]);

                count++;
            }
            else
            {aList.set(count, aList.get(count)+ temp);
            }
        }
        //aList.add(array[array.length - 1]);

        return aList.toArray(new String[0]);










        /* int count = 0;
        for ( int i = array.length - 1; i >= 0; i --)
        {
            if (array[i].equals(array[i-2]))
            {
               array[i] += array[i];
               array[i] = null;
               count++;
            }
        }

        for (int j = 0; j < count; j++)
        {
            if (!array[j].equals(null))
            {

            }
        }

*/


    }

}
