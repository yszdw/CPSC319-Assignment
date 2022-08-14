//package assignment4;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class read_Input_file {                                     //I got some useful codes from https://javaconceptoftheday.com/how-to-sort-a-text-file-in-java/.
    public static ArrayList<String> line = new ArrayList<String>();      //store all the elements into an arraylist.
    public static ArrayList<String> readInput() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("please input the file: ");
        String filename = input.next();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(filename));
        String currentLine = reader.readLine();
        while (currentLine != null) {
            line.add(currentLine);                                 //adding all the words into an arraylist using a while loop.
            currentLine = reader.readLine();
        }
        return line;                                                  //return an arraylist.
    }
}
