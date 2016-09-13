import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set containing
 * their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both).
  * For example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9]. */

public class Eleven
{
    public static void main(String[] args)
    {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        int[] data1 = {1, 4, 7, 9};
        int[] data2 = {2, 4, 5, 6, 7};
        addToSet(set1, data1);
        addToSet(set2, data2);
        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> addToSet(Set<Integer> set, int[] data)
    {
        for(int i = 0; i < data.length; i++)
        {
            set.add(data[i]);
        }
        return set;
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> set3 = new TreeSet<>();
        Set<Integer> set1Copy = new TreeSet<>();
        set1Copy.addAll(set1);
        set1Copy.retainAll(set2);
        set1.removeAll(set1Copy);
        set2.removeAll(set1Copy);
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;
    }
}
