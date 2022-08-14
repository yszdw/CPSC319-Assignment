//package assignment4;
//This class is to find the maximum height of the tree. The code is given by the professor.
public class MaxHeight { //My codes are copied from the assignment 4 instruction
    public static int FindMaxHeight(Node node){
            if (node == null)
                return 0;
            else
            {
                int lDepth = FindMaxHeight(node.leftChild);
                int rDepth = FindMaxHeight(node.rightChild);
                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }
    }

