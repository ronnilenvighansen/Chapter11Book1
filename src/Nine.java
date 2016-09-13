import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method hasEven that accepts a list of integers as a parameter and returns true if the set contains at least
one even integer and false otherwise. If passed the empty set, it should return 0. */

public class Nine
{
    public static void main(String[] args)
    {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        System.out.println(hasEven(set));
    }

    public static boolean hasEven(Set<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
        boolean flag = false;
        while(iterator.hasNext())
        {
            if(iterator.next() % 2 == 0)
            {
                flag = true;
            }
            else
            {
                flag = false;
            }
        }
        return flag;
    }
}
