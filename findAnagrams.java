//package A3;

import java.util.ArrayList;
import java.util.Arrays;

//This class is to find the anagrams in ListA and return ListB.
public class findAnagrams {

    public static ArrayList<LinkedList> findAnagrams(ArrayList<String> ListA) {
        LinkedList arr[] = new LinkedList[ListA.size()];                 //for example, if the input file is "example_1--8_words.txt,
        for (int z = 0; z < ListA.size(); z++) {                         //the size of List A is 8. Then we can know that The maximum size of ListB is 8,
            arr[z] = new LinkedList();                                   //so we just need to create 8 linked lists,and each linked list
        }                                                                //contains the corresponding anagram words.


        int LinkedListIndex = 0;                                         //Those codes on the right side are to find the anagrams words and insert them into the corresponding linked list.
        int i = 0;                                                       //the linkedListIndex starts from 0. For example,if anagrams(e.g. arc and car) have been found and inserted into the first linked list, index will increase by one. Index will stop increasing until all the anagrams have been found.
        while (i < ListA.size()) {                                       //firstly we start from the first word.
            if (ListA.get(i) != "repeated") {                            //if the word has been inserted into the linked list,the program should skip this word and traverse into the next word.
                String input = ListA.get(i);                             //Then we need to get the value of the first word and sort it Alphabetically.
                char[] charArray = input.toCharArray();                  //We will use it later to compare it with the rest of the words.
                Arrays.sort(charArray);                                  //if we want to use the function Array.sort, we must convert String into char array.
                String sortedString = new String(charArray);
                arr[LinkedListIndex].insertTail(ListA.get(i));           //Since the first world in each linked list is always the smallest,just simply insert it into Node "head"(the first node)
                int j = i + 1;                                           //the inner while loop is to check whether the rest of the word is the anagram of the first word. If so,insert it into the tail of the linked list.
                while (j < ListA.size()) {
                    String input1 = ListA.get(j);                        //Same as before, we need to get the value of the rest of the word and sort it alphabetically.
                    char[] charArray1 = input1.toCharArray();            //same as before, convert String into char array and sort it.
                    Arrays.sort(charArray1);
                    String sortedString1 = new String(charArray1);
                    {                                                      //for example, after sorting "arc" and "car" alphabetically and storing the results into sortedString and SortedString1 respectively, we will find that sortedString and sortedString1 are the same. Then "car" will be inserted into the tail of the linked list.
                        if (sortedString.equals(sortedString1)) {
                            arr[LinkedListIndex].insertTail(ListA.get(j));  // check whether the rest of the words is the anagram of the first word. If so, insert it into the tail of the linked list.
                            ListA.set(j, "repeated");                       //if the anagram has been found, just set its value into "repeated". The program will skip this word and traverse into the next word.
                        }
                    }
                    j++;
                }
            }
            i++;
            LinkedListIndex++;
        }

        ArrayList<LinkedList> GetListB = new ArrayList<LinkedList>();   //if we take a close at the "arr" we got above, we can find that some Linked lists contains nothing and the whole arraylist is not continuous
        for (int t = 0; t < ListA.size(); t++) {                        //This is because if the program reads the word "repeated", a new linked list will be created but nothing will be inserted into it. That's why there are some "null" linked lists in the arraylist.
            if (arr[t].head != null) {                                  //for example, arc and car are anagrams. when the program reach the word "car" in the outer while loop, a new linked list is created but nothing will be inserted because the program will directly jump out of this loop and continue traversing the next word.
                GetListB.add(arr[t]);                                   //here we are trying to find the valid linked lists((with word inside) and combine them into a arraylist.
            }
        }
        return GetListB;                                                //Then we get a continuous arraylist with valid linked lists.
    }                                                                   //for example, if the input file is "example_1--8_words.txt, the size of "arr" will be 8 while the size of GetListB is 4.

}

