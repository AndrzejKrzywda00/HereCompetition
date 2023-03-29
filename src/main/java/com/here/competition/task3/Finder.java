package com.here.competition.task3;

public class Finder {

    /***
     * Determines if element is present is the array
     * @param array is assumed to be sorted in ascending order
     */
    public static boolean find(int[] array, int element) {
        int start = 0;
        int end = array.length-1;
        while (start < end) {
            int p = start + (end - start) / 2;
            if (array[p] == element) {
                return true;
            }
            if (array[p] < element) {
                start = p+1;
            }
            if (array[p] > element) {
                end = p;
            }
        }
        return false;
    }
}
