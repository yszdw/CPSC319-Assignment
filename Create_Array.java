package com.company;

import java.util.Arrays;
import java.util.Random;//used to create random array


public class Create_Array {
    public static int[] Build_Array(int size, String order) {

        int[] array = new int[size];
        if (order.equals("0")) {                       //Determine whether the input order is random, if so, the program needs to generate randomg numbers.
            Random number = new Random();             //I was trying to generate random integer numbers, and I got some useful information from https://www.geeksforgeeks.org/generating-random-numbers-in-java/
//          System.out.println("unsorted Random integer numbers are generated(before sorting): ");
            for (int i = 0; i < size; i++) {
                array[i] = number.nextInt();
                //System.out.print(array[i] + " ");
            }

        } else if (order.equals("1")) {                 //Determine whether the input order is "ascending“, if so, the program needs to generate ascending numbers.
            Random number = new Random();
            int i = 0;
            for (i = 0; i < size; i++) {
                array[i] = number.nextInt();          //we have to get the random integer numbers and sort it into ascending order.
            }
            System.out.println("\n");                 //We can simply use the function arrays.sort() to sort it into ascending order.
            Arrays.sort(array);                       // Or we can sort it by using merge sort as it is considered as the most efficient among those algorithms.
//          System.out.println("ascending integer numbers are generated(before sorting): ");
//          for (int j = 0; j < size; j++) {
//              System.out.print(array[j] + " ");
//          }

        } else if (order.equals("2")) {               //Determine whether the input order is ”descending“, if so, the program needs to generate descending numbers.
            Random number = new Random();
            int i = 0;
            for (i = 0; i < size; i++) {
                array[i] = number.nextInt();
            }                                       // //Like we did in the second part, firstly we should create some random numbers and sort it into the ascending order.
            Arrays.sort(array);                     //After that we need to reverse the ascending order to get a descending order.
            for (i = 0; i < size / 2; i++) {        //I was trying to reverse the array.
                int j = array[i];                    //I got some useful information on how to reverse the order from https://www.geeksforgeeks.org/reverse-an-array-in-java/
                array[i] = array[size - i - 1];
                array[size - i - 1] = j;
            }
//           System.out.println("descending integer numbers are generated(before sorting): ");
//           for (int z = 0; z < size; z++) {
//              System.out.print(array[z] + " ");
//           }
        }
        return array;
    }
}
