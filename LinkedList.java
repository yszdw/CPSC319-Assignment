//package A3;

//This class implements the insertTail function.
public class LinkedList {
    Node head;                                     //already given by the professor. no need to modify it.
    Node tail;

    public LinkedList() {
        this.head = null;                          //already given by the professor. no need to modify it.
        this.tail = null;
    }

    public void insertTail(String word) {
        Node newNode = new Node(word);             //insert the first word into the first Node.
        if (head == null) {
            head = newNode;
            head.next = null;
        } else {                                   //insert the rest of anagrams into the tail.
            newNode.next = null;
            Node Next = head;                      //I got some useful information from my Spring class notes ENSF337. ENSF337 is mostly about C and C++,but the idea of traversing and printing the linked list is the same.
            while (Next.next != null) {            //use a while loop to traverse the linked list and find the last Node.
                Next = Next.next;
            }
            Next.next = newNode;

        }
    }
}