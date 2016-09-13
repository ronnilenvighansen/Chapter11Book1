import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
 * odd length from the set */

public class Ten
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("james");
        set.add("jane");
        System.out.println(removeOddLength(set));
    }

    public static Set<String> removeOddLength(Set<String> set)
    {
        Set<String> finalSet = new HashSet<>();
        Iterator<String> iterator = set.iterator();
        String current;
        while(iterator.hasNext())
        {
            current = iterator.next();
            if(current.length() % 2 == 0)
            {
                finalSet.add(current);
            }
        }
        return finalSet;
    }

}
