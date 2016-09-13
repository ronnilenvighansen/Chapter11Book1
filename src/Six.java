import java.util.HashSet;

/**
 * Created by Ronni on 01-09-2016.
 */

/* Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
 * values in the list. Use a set as auxiliary storage to help you solve this problem. For example, if a list contains
 * the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique
 * values. */

public class Six
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        int[] data = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        for(int i = 0; i < data.length; i++)
        {
            set.add(data[i]);
        }
        System.out.println(countUnique(set));
    }

    public static int countUnique(HashSet<Integer> set)
    {
        int i = 0;
        while(i < set.size())
        {
            i++;
        }
        return i;
    }
}
