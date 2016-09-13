import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Ronni on 01-09-2016.
 */

/* Write a method called partition that accepts a list of integers and an integer value E as its parameter, and
 * rearranges (partitions) the list so that all the elements with values less than E occur before all elements with
  * values greater than E. The exact order of the elements is unimportant, so long as all elements less than E
  * appear before all elements greater than E. For example, for the linked list
  * [15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9], one acceptable ordering of the list after a call of partition(list, 5)
  * would be [-1. 1. 2. 4. -3, 12, 8, 21, 6, 30, 15, 9]. You may assume that the list contains no duplicates and does
  * not contain the value E. */

public class Four {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        int[] data = {15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9};
        for(int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }
        System.out.println(partition(list));
    }
    
    public static LinkedList<Integer> partition(LinkedList<Integer> list)
    {
        Collections.sort(list);
        return list;
    }
}
