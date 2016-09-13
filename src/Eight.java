import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest
 * string in the list. If your method is passed an empty set, it should return 0. */

public class Eight
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("bo");
        set.add("jens");
        set.add("janus");
        System.out.println(minLength(set));
    }

    public static int minLength(Set<String> set)
    {
        Iterator<String> iterator = set.iterator();
        if(!iterator.hasNext())
        {
            return 0;
        }
        int min = iterator.next().length();
        while(iterator.hasNext())
        {
            int temp = iterator.next().length();
            if(temp < min)
            {
            min = temp;
            }
        }
        return min;
    }
}
