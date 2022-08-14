package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {
        Get_Input_Info Info = new Get_Input_Info();                            //we need to get user's input information.
        String Info_Order = Info.getOrder();                                  //store the input result of order into Info_order.
        int Info_size = Info.getSize();                                       //store the input result of size into Info_size.
        Create_Array unsorted_Array= new Create_Array();
        int []Array1 = unsorted_Array.Build_Array(Info_size,Info_Order);       //Given the user's requirements,we need to create the corresponding array. store the return value into Array1
        String Info_type = Info.getType();                                     //store the input result of size into Info_type.
        sorted_Array sorted_Array = new sorted_Array();
        int []Array2 = sorted_Array.sorted(Array1,Info_type);                 //Given the user's requirement,we need to sort the unsorted array. store the return value into Array2
        output_in_txt result = new output_in_txt();                           //output the result into the txt file
        result.output_txt(Array2);
    }
}
