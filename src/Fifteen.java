import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the
 * most frequently occurring integer (the "mode") occurs in the list. Solve this problem using a map as auxiliary
  * storage. If the list is empty, return 0 */

public class Fifteen
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        list.add(12);
        list.add(25);
        list.add(31);
        list.add(25);
        list.add(31);
        list.add(47);
        list.add(25);
        list.add(47);
        list.add(25);
        System.out.println(maxOccurrences(getNumberOccurrences(list, map)));
    }

    public static Map<Integer, Integer> getNumberOccurrences(List<Integer> list, Map<Integer, Integer> map)
    {
        for(Integer number : list)
        {
            if(map.containsKey(number))
            {
                int count = map.get(number);
                map.put(number, count + 1);
            }
            else
            {
                map.put(number, 1);
            }
        }
        return map;
    }

    public static int maxOccurrences(Map<Integer, Integer> map)
    {
        int temp = 0;
        for(Integer number : map.keySet())
        {
            int count = map.get(number);
            if(count > temp)
            {
                temp = count;
            }
        }
        return temp;
    }
}
