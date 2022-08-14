//package A3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//This class is to read the input file and sort them into ListA and return it.
public class sorted_array {
    public static ArrayList<String> GetListA = new ArrayList<String>();

    public static ArrayList<String> sorted_array(String filename) throws IOException {
        BufferedReader reader;                                       //read input file. I got some useful information from https://javaconceptoftheday.com/how-to-sort-a-text-file-in-java/
        reader = new BufferedReader(new FileReader(filename));
        String currentLine = reader.readLine();
        while (currentLine != null) {
            GetListA.add(currentLine);
            currentLine = reader.readLine();
        }
        Collections.sort(GetListA);                                  //sort them Alphabetically to get ListA.
        return GetListA;
    }
}