import java.util.TreeSet;

/**
 * Created by Ronni on 01-09-2016.
 */

/* Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges the
 * list's elements into sorted ascending order, as well as removing all duplicate values from the list. For example,
 * the list [7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9] would become [-9, -5, 4, 7, 8, 11, 15, 27, 32] after a call
  * to your method. Use a Set as part of your solution. */

public class Five
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        int[] data = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
        for(int i = 0; i < data.length; i++)
        {
            set.add(data[i]);
        }
        System.out.println(set);
    }
}
