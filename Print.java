//package A3;

import java.util.ArrayList;

//This class simply traverse List B print it into the standard output.
class Print {
    public static void print(ArrayList<LinkedList> ListB) {
        for (int i = 0; i < ListB.size(); i++) {        //I got some useful information from my Spring class notes ENSF337.
            Node current = ListB.get(i).head;           //ENSF337 is mostly about C and C++,but the idea of traversing and printing the linked list is the same.
            if (current != null) {
                System.out.print(current.word);         //for example, if the input file is "example_1--8_words.txt, We have 4 valid linked lists in the array list.
                Node next = current.next;               //The outer for loop is to traverse those 4 linked lists and the inner for loop is to traverse those Nodes inside each linked list.
                for (next = current.next; next != null; next = next.next) {
                    System.out.print(" " + next.word);
                }
            }
            System.out.print("\n");
        }
    }
}


