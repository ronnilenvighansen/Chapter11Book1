import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
 * and returns a new map containing only the key/value pairs that exist in both of the parameter maps. In order for a
  * key/value pair to be included in your result, not only do both maps need to contain a mapping for that key, but
  * they need to map it to the same value. For example, if the two maps passed are {Janet=87, Logan=62, Whitaker=46,
  * Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} and {Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80,
  * Brian=60, Lisa=83, Sylvia=87}, your method would return the following new map
  * (the order of the key/value pairs does not matter): {Logan=62, Stefanie=80, Jeff=88, Kim=52}. */

public class Fourteen
{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> map3 = new HashMap<>();
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 46);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);
        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);
        System.out.println(intersect(map1, map2));
    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        Map<String, Integer> map3 = new HashMap<>();
        for(Map.Entry<String, Integer> entry1 : map1.entrySet())
        {
            for(Map.Entry<String, Integer> entry2 : map2.entrySet())
            {
                if(entry1.equals(entry2))
                {
                    map3.put(entry1.getKey(), entry1.getValue());
                }
            }
        }
        return map3;
    }
}
