//package assignment4;
//This class is to check if the input word is exist or not.
public class wordExistence { //My codes are adapted from https://blog.csdn.net/weixin_43260719/article/details/109631243
    public static boolean Existence(Node topmost, String InputWord){

            if (topmost == null) {
                return false;
            }
            else if (topmost.word.equals(InputWord)) {
                System.out.println("FOUND! It appears " + topmost.frequency + " times in the input text file");
                return true;   //if the input word exists in the binary search tree, simply print it.
            }

            boolean leftChild = Existence(topmost.leftChild, InputWord); //use recursion to traverse the binary tree
            boolean rightChild = Existence(topmost.rightChild, InputWord);
            return leftChild || rightChild;
        }

    public static boolean NonExistence(Node topmost, String InputWord){
        if (topmost == null) {
            return false;
        }
        else if (topmost.word.equals(InputWord)) {
            return true;   // same as before, if the word doesn't exist,return false;
        }

        boolean leftChild = NonExistence(topmost.leftChild, InputWord);
        boolean rightChild = NonExistence(topmost.rightChild, InputWord);
        return leftChild || rightChild;
    }
}

