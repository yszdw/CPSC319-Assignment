package com.company;

public class sorted_Array {
    public static int[] sorted(int array[], String type) {
        if (type.equals("merge")) {
            int []temp = new int[array.length];
            int start = 0;
            long startTime1_millis = System.currentTimeMillis();
            sorting_implementation.merge_sort(array,start,array.length-1,temp);
            long endTime1_millis = System.currentTimeMillis();
            long elapsed1_millis = endTime1_millis - startTime1_millis;
            System.out.println("\n");
            System.out.println("time(in seconds) to sort the array using merge sort algorithm: "+ elapsed1_millis/1000);
        } else if (type.equals("bubble")) {
            long startTime1_millis = System.currentTimeMillis();
            sorting_implementation.bubble_sort(array);
            long endTime1_millis = System.currentTimeMillis();
            long elapsed1_millis = endTime1_millis - startTime1_millis;
            System.out.println("\n");
            System.out.println("time(in seconds) to sort the array using bubble sort algorithm: "+ elapsed1_millis/1000);
        } else if (type.equals("insertion")) {
            long startTime1_millis = System.currentTimeMillis();
            sorting_implementation.insertion_sort(array);
            long endTime1_millis = System.currentTimeMillis();
            long elapsed1_millis = endTime1_millis - startTime1_millis;
            System.out.println("\n");
            System.out.println("time(in seconds) to sort the array using insertion sort algorithm: "+ elapsed1_millis/1000);
        } else if (type.equals("selection")) {
            long startTime1_millis = System.currentTimeMillis();
            sorting_implementation.selection_sort(array);
            long endTime1_millis = System.currentTimeMillis();
            long elapsed1_millis = endTime1_millis - startTime1_millis;
            System.out.println("\n");
            System.out.println("time(in seconds) to sort the array using selection sort algorithm: "+ elapsed1_millis/1000);
        }
        return array;
    }

}
