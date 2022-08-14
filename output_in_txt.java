package com.company;
import java.io.*;
public class output_in_txt {

    public static void output_txt(int[] arr) throws IOException { //I haven't taken ENSF 409 so I have no idea how to output the result into a txt file in java.
                                                                  // Then I got some useful information on how to output the result to txt https://www.youtube.com/watch?v=k3K9KHPYZFc
        String filename = "output.txt";
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        for(int i = 0; i<arr.length;i++)
        {
            pw.println(arr[i]);                                   //print the value in the txt file. One item per line
        }
        pw.close();
    }
}

