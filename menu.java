//package assignment4;

import java.util.Scanner;
//This class is a menu,aiming to ask the user to enter what they want to see and print the results calculated in the other classes.
public class menu {

    public static void Createmenu(int number, int height, treeBuilder Tree, int number_of_unique) {
        Result Getresult = new Result();
        System.out.println("\n>Total number of words = " + number);    //According to the rubric, In the beginning we need to display the total number of words.
        System.out.println(">Number of unique words = "+ number_of_unique);   //According to the rubric, In the beginning we need to display the total number of unique words.
        System.out.println(">The word(s) occurs most often and the number of times it/they occur(s) = ");
        Getresult.output(Tree.topmost);                                      //According to the rubric, In the beginning we need to display all the word with the highest frequency.
        System.out.println(">The maximum height of the tree = " + height); // //According to the rubric, In the beginning we need to display the height of the tree.

        //Then we should ask the users to enter what content they would like to see.
        System.out.println("\nchoose one that you are interested in from the following options(enter an integer from 1 to 4) ");
        System.out.println("\n1: In-order");
        System.out.println("2: Pre-order");
        System.out.println("3: Post-order");
        System.out.println("4: Search for a word");
        System.out.println("\nYour choice is:");



        while (true) {
            Scanner s = new Scanner(System.in);     //read users' input result.
            int result = Integer.parseInt(s.next());
            switch (result) {
                case 1:
                    System.out.print("IN-ORDER output: ");
                    traversalMethod In_Order = new traversalMethod();
                    In_Order.inOrderTraverse(Tree.topmost);          //display the binary tree in Inorder traverse method.

                    break;

                case 2:
                    System.out.print("PRE-ORDER output: ");
                    traversalMethod Pre_Order = new traversalMethod();
                    Pre_Order.PreOrderTraverse(Tree.topmost);  //display the binary tree in Preorder traverse method.
                    break;

                case 3:
                    System.out.print("POST-ORDER output: ");
                    traversalMethod Post_Order = new traversalMethod();
                    Post_Order.PostOrderTraverse(Tree.topmost);    //display the binary tree in Postorder traverse method.
                    break;

                case 4:
                    System.out.println("please enter a word: ");  //ask the user to input a word
                    Scanner s1 = new Scanner(System.in);
                    String result2 = s1.next();
                    wordExistence z = new wordExistence();   // if the word exists, print itself and its frequency.
                    z.Existence(Tree.topmost, result2);
                    if (z.NonExistence(Tree.topmost, result2) == false) {  //if the word doesn't exist, the return value will be false.
                        System.out.println("Word not found!");
                    }
                    break;
                default:
                    System.out.println("invalid input, please enter an integer number from 1 to 5"); // ask user to reenter the number.
                    break;

            }
            return;
        }
    }
}
