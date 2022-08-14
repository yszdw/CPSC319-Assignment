//package assignment4;
//This class is to print the entire tree using 3 traverse method.
public class traversalMethod { //My codes are adapted from "Tree Code Example" in D2L.
    public static void inOrderTraverse(Node topmost) {
        if (topmost != null) {
            inOrderTraverse(topmost.leftChild);
            System.out.print(topmost.word + " ");
            inOrderTraverse(topmost.rightChild);
        }
    }

    public static void PreOrderTraverse(Node topmost) {
        if (topmost != null) {
            System.out.print(topmost.word + " ");
            PreOrderTraverse(topmost.leftChild);
            PreOrderTraverse(topmost.rightChild);
        }
    }

    public static void PostOrderTraverse(Node topmost) {
        if (topmost != null) {
            PostOrderTraverse(topmost.leftChild);
            PostOrderTraverse(topmost.rightChild);
            System.out.print(topmost.word + " ");
        }
    }

}


