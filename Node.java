//package assignment4;
//This class is a construction.
public class Node {
    public String word;   //each node consists of a word, leftchild and rightchild.
    public int frequency;
    public Node leftChild;
    public Node rightChild;
    public Node(String word) {
        this.word = word;
        this.frequency = 1;  //Since we need to calculate the frequency of each element later, we can set the frequency of each element to 1 in the beginning.
    }
}


