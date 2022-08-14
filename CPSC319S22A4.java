//package assignment4;

import java.io.IOException;
import java.util.ArrayList;
//The whole program starts from here.
public class CPSC319S22A4 {

    public static void main(String[] args) throws IOException {
        read_Input_file reader = new read_Input_file();
        ArrayList<String> GetInput = reader.readInput();  //store the return value into Getinput.
        String output[] = GetInput.toString().replaceAll("[^0-9a-zA-Z ]", " ").toLowerCase().split("\\s+");
        //according to the instruction, we will have to process the reading text file.
        //all words will be converted to lower case and any symbol that is not alphanumeric will be replaced with a space


        treeBuilder GetBST = new treeBuilder();
        treeBuilder Tree = GetBST.createTree(output);


        Result Getresult = new Result();   //get the return value of number of nodes and unique words.
        int number = Getresult.CountTotal(Tree.topmost); //store the return value into number.
        int number_of_unique = Getresult.Getunique();    //store the return value into number_of_unique.


        MaxHeight GetHeight = new MaxHeight();    //get the return value of the maximum height and store the value into height.
        int height = GetHeight.FindMaxHeight(Tree.topmost);


        menu GetMenu = new menu();  //create an object.
        GetMenu.Createmenu(number,height,Tree,number_of_unique);  //we will be using those values later. So make sure to pass them.

        //Then the whole program is done!!!
    }
}
