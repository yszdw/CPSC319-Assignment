package com.company;

import java.util.Scanner;

public class Get_Input_Info {
    private String order;
    private int size;
    private String type;

    public String getOrder() { //since order, size and type are private elements, we can add three function to get its value. Main function will call these function later to get their return values.
        return order;
    }
    public int getSize() {
        return size;
    }
    public String getType() {
        return type;
    }

    public Get_Input_Info() {
        Scanner s = new Scanner(System.in);
        System.out.println("please input the order: (0, 1, 2 )");//ask user to specify the order.  0 represents random, 1 represents ascending, 2 represents descending
        order = s.next();
        System.out.println("please input the size (e.g. 10, 100, 1000, 10000, 100000, 1000000）: ");//ask the user to specify the size of the array.
        size = Integer.parseInt(s.next()); //convert String to Integer
        System.out.println("please input the type of algorithm (bubble, insertion, selection, merge): ");//ask the user to specify the algorithm they want to use.
        type = s.next();
    }
}