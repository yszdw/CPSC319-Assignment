//package assignment4;

//This class is insert all the words into a binary tree.
public class treeBuilder {

    public static Node topmost = null;  //create a root node called topmost,and set its value into null.

    public void insert(String word) {  //got some useful information from https://favtutor.com/blogs/binary-search-tree-java.
        if (topmost == null) {       //if the root contains nothing, set this word into root.
            topmost = new Node(word);
            return;
        }
        Node current = topmost;    //then we use the node "current" to replace the root.
        while (true) {
            if (word.compareTo(current.word) > 0) { //if the word is larger than the word in the parent node, insert it to the right side.
                if (current.rightChild == null) {
                    Node newNode = new Node(word);
                    current.rightChild = newNode;
                    return;
                } else
                    current = current.rightChild;   //use while loop to find the end of the tree and  insert it in the right position.
            } else if (word.compareTo(current.word) < 0) {  //if the word is samller than the word in the parent node, insert it to the right side.
                if (current.leftChild == null) {
                    Node newNode = new Node(word);
                    current.leftChild = newNode;
                    return;
                } else
                    current = current.leftChild;
            } else if (word.equals(current.word)) {  //if the word is exactly equal to the parent node, we don't need to insert it.
                current.frequency++;  //frequency add by one.
                return;
            }
        }
    }


    public treeBuilder createTree(String[] output) {  // here we are trying to add all the word into the binary tree.
        treeBuilder Tree = new treeBuilder();
        int i = 0;
        while(i<output.length){
            if(output[i].isEmpty() == false){  // since any symbol that is not alphanumeric will be replaced with a space,we have to add this line to make sure that space will not be inserted.
                insert(output[i]);    //insert every element in the String
            }
            i++;
        }
        return Tree; // a binary tree is created. Then return this tree.
    }
}
