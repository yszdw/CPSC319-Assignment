//package A3;
import java.util.Scanner;
import java.util.ArrayList;

//The whole program starts from class main.
public class CPSC319S22A3 {
    public static String filename;

    public static void main(String[] args) throws Exception {
        //According to the Step 1 and step 2 in the instruction , given the input text file with unsorted words, firstly we need to
        //read the input file and sort it into ListA.
        Scanner input = new Scanner(System.in);
        System.out.println("please input your text file: ");
        filename = input.next();
        sorted_array Get_ListA = new sorted_array();
        ArrayList<String> ListA = Get_ListA.sorted_array(filename);

        //According to the step 3 in the instruction,we need to find the anagrams in ListA and insert them into the
        //linked list to get ListB.
        findAnagrams Get_ListB = new findAnagrams();
        ArrayList<LinkedList> ListB = Get_ListB.findAnagrams(ListA);

        //According to the step 4 in the instruction, we need to traverse List B and print it into the standard output.
        //Then the whole programs is done.
        Print printResult = new Print();
        printResult.print(ListB);


    }
}
