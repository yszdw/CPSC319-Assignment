package com.company;
import java.util.Scanner;

public class Main {

    //Recursive algorithm implementation
    public static long fibRec(int n)
    {

        if (n == 0)
        {
            return 0;
        }
        if (n==1)
        {
            return 1;
        }
        else
            return fibRec(n - 1) + fibRec(n - 2);
    }

    //memoization algorithm implementation
    public static long fibMem(int n)
    {
        long[]Cache = new long[n+1];
        for (int j=0;j<=n;j++)
        {
            Cache[j]=0;
        }
        return fibMem(n,Cache);
    }

    public static long fibMem(int n,long[] Cache)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n== 1)
        {
            return 1;
        }
        else if (Cache[n] != 0)
        {
            return Cache[n];
        }
        else
        {
            Cache[n] = fibMem(n - 1,Cache) + fibMem(n - 2,Cache);
            return Cache[n];
        }
    }

    //iteration algorithm implementation
    public static long fibIter(int n)
    {
        long firstNum = 0;
        long secondNum = 1;
        long thirdNum = 0;
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            for (int i = 2; i <= n ; i++) {
                thirdNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = thirdNum;
            }
        }
        return thirdNum;
    }


    public static void main(String[] args)
    {


        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("please input an integer number:");
        int inputSize = s.nextInt();



        for (int i = 1; i <= inputSize; i++)
        {
            //Recursive algorithm
            long sum = 0;

            for(int j = 1; j <= 10; j++)
            {
                long startTime1_nano = System.nanoTime();
                fibRec(i);
                long endTime1_nano = System.nanoTime();
                long elapsed1_nano = (endTime1_nano - startTime1_nano);
                sum += elapsed1_nano;
            }
            System.out.println("Average Time(in ns) to compute " + "f" + (i) + " using Algorithm 1: " + sum/10);


//            long startTime1_millis = System.currentTimeMillis();
//            System.out.print("answer is: " + fibRec(i)+" ");
//            System.out.println("\n");
//            long endTime1_millis = System.currentTimeMillis();
//            long elapsed1_millis = endTime1_millis - startTime1_millis;
//            System.out.println("Time(in ms) to compute " + "f" + (i) +  " using Algorithm 1: " + elapsed1_millis);
//            System.out.println("\n");
//

            //memoization algorithm
            sum = 0;
            for(int j = 1; j <= 10; j++)
            {
                long startTime2_nano = System.nanoTime();
                fibMem(i);
                long endTime2_nano = System.nanoTime();
                long elapsed2_nano = endTime2_nano - startTime2_nano;
                sum+=elapsed2_nano;
            }
            System.out.println("Average Time(in ns) to compute " + "f" + (i) +  " using Algorithm 2: " + sum/10);


//            long startTime2_millis = System.currentTimeMillis();
//            System.out.print("answer is " + fibMem(i)+" ");
//            System.out.println("\n");
//            long endTime2_millis = System.currentTimeMillis();
//            long elapsed2_millis = endTime2_millis - startTime2_millis;
//            System.out.println("Time(in ms) to compute " + "f" + (i) +  " using Algorithm 2: " + elapsed2_millis);
//            System.out.println("\n");


            //iterative algorithm
            sum = 0;
            for(int j = 1; j <= 10; j++) {
                long startTime3_nano = System.nanoTime();
                fibIter(i);
                long endTime3_nano = System.nanoTime();
                long elapsed3_nano = endTime3_nano - startTime3_nano;
                sum += elapsed3_nano;
            }
            System.out.println("Average Time(in ns) to compute " + "f" + (i) +  " using Algorithm 3: " + sum/10);


//            long startTime3_millis = System.currentTimeMillis();
//            System.out.print("answer is  " + fibMem(i) + " ");
//            System.out.println("\n");
//            long endTime3_millis = System.currentTimeMillis();
//            long elapsed3_millis = endTime3_millis - startTime3_millis;
//            System.out.println("Time(in ms) to compute " + "f" + (i) +  " using Algorithm 3: " + elapsed3_millis);
//            System.out.println("\n");

        }
    }
}

