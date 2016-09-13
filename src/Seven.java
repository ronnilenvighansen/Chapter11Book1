import java.util.TreeSet;

/**
 * Created by Ronni on 01-09-2016.
 */

/* Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique
* integers that occur in both lists. Use one or more sets as storage to help you solve this problem. For example, if
* one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other list contains the values
* [-5, 15, 2, -1, 7, 5, 36], your method should return 4 because the elements -1, 2, 7 and 15 occur in both lists. */
public class Seven
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        int[] data1 = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        int[] data2 = {-5, 15, 2, -1, 7, 5, 36};
        addToSet(set1, data1);
        addToSet(set2, data2);
        set1.retainAll(set2);
        System.out.println(set1);
    }

    public static TreeSet<Integer> addToSet(TreeSet<Integer> set, int[] data)
    {
        for(int i = 0; i < data.length; i++)
        {
            set.add(data[i]);
        }
        return set;
    }
}
