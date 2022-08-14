package com.company;

public class sorting_implementation {

    //bubble sort implementation
    //citation:  my codes are adapted form lecture notes "W2.4.2 Sorting - Bubble Sort". I made some changes based on the lecture code. I used two while loops instead of two for loops; Also, I changed the loop condition in the second while loop.
    public static int[] bubble_sort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int j = 0;
            while (j < arr.length - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
        return arr;
    }


    //insertion sort implementation
    //citation: my codes are adapted from https://www.javatpoint.com/insertion-sort-in-java  I made some changes based on those codes from javapoint. I used two while loops instead of one for loop and while loop;
    public static int[] insertion_sort(int[] arr) {
        int i = 1;
        while (i < arr.length){
           int temp = arr[i];
           int j = i - 1;
           while (j >= 0 && arr[j] > temp){
               arr[j + 1] = arr[j];
               j--;
           }
           i++;
        }
        return arr;
    }

    //selection sort implementation
    //citation:  my codes are adapted from lecture notes "W2.4.1 Sorting"  I made some changes based on the lecture code. I used two while loops instead of two for loops;
    public static int[] selection_sort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int min = i;
            int j = i + 1;
            while(j < arr.length){
                if (arr[j] < arr[min]) {
                    min = j;
                }
                j++;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            i++;
        }
        return arr;
    }

    //merge sort implementation
    //citation: my codes are adapted from tutorial 2 java file "sorting" and https://blog.csdn.net/weixin_43486804/article/details/100144110?ops_request_misc=&request_id=&biz_id=102&utm_term=%E5%BD%92%E5%B9%B6%E7%AE%97%E6%B3%95%20java&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-5-100144110.142^v32^experiment_2_v1,185^v2^control&spm=1018.2226.3001.4187.
    public static void merge_sort(int[] arr, int L, int R, int[] temp) {
        if (L >= R) {
            return;
        }
        int centre = (L + R) / 2;
        merge_sort(arr, L, centre, temp);
        merge_sort(arr, centre + 1, R, temp);
        merge(arr, L, R, centre, temp);
    }

    public static void merge(int[] arr, int L, int R, int centre, int[] temp) {
        int j = L;
        int mid = centre + 1;
        int i;
        int key = i = L;
        while (key <= R) {
            if (i > centre) {
                temp[key] = arr[mid];
                mid++;
            } else if (mid > R) {
                temp[key] = arr[i];
                i++;
            } else if (arr[i] < arr[mid]) {
                temp[key] = arr[i];
                i++;
            } else {
                temp[key] = arr[mid];
                mid++;
            }
            key++;
        }
        while (j <= R) {
            arr[j] = temp[j];
            j++;
        }
    }
}





