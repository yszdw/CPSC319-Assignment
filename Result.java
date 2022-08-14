//package assignment4;

//This class is to find the number of words, unique words, and print all the words with the highest frequency.
public class Result {  // My codes are adapted from https://blog.csdn.net/qq_44292334/article/details/115148633

    public static int unique = 0;
    public static int max = 0;
    public static int number = 0;

    public static int Getunique(){
        return unique;                          //get the result of unique. This function will be called later.
    }
    public static void preOder(Node topmost) {
        if (topmost != null) {
            if (topmost.frequency == 1) {
                unique++;                      //if the frequency of the element equals to one, the total number of unique words will add by one.
            }
            if (topmost.frequency > max) {
                max = topmost.frequency;     //here we are trying to find the element with the highest frequency.
            }                                //"max" will be replaced once an element with higher frequency is found.
            number++;                        //here we are trying to find the total number of nodes. "number" will add one each time till the end of the program.
            preOder(topmost.rightChild);       //use preorder to traverse the binary tree.
            preOder(topmost.leftChild);
        }
    }
    public static int CountTotal(Node topmost) {
        preOder(topmost);
        return number;                        //return the total number of nodes, this function will be called later in class "menu" later.
    }

    public void output(Node topmost) {
        if (topmost != null) {
            if (topmost.frequency == max) { //print all the words with the highest frequency.
                System.out.println(topmost.word + " = " + max + " times");
            }
            output(topmost.rightChild);  //use preorder to traverse the binary tree.
            output(topmost.leftChild);
        }
    }
}



