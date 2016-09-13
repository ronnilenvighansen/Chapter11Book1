import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if
 * every key in the first map is also contained in the second map and maps to the same value in the second map. For
  * example, {Smith=949-0504, Marty=206-9024} is a submap of
  * {Marty=206-9024, Hawking=123-4567, Smith=949-0504, Newton=123-4567}. The empty map is a submap of every map. */

public class Seventeen
{
    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("Smith", "949-0504");
        map1.put("Marty", "206-9024");
        map2.put("Marty", "206-9024");
        map2.put("Hawking", "123-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");
        System.out.println(subMap(map1, map2));
    }

    public static boolean subMap(Map<String, String> map1, Map<String, String> map2)
    {
        Map<String, String> map3 = new HashMap<>();
        boolean flag = true;
        for(Map.Entry<String, String> entry1 : map1.entrySet())
        {
            for(Map.Entry<String, String> entry2 : map2.entrySet())
            {
                if(entry1.equals(entry2))
                {
                    map3.put(entry1.getKey(), entry1.getValue());
                }
            }
        }

        for(Map.Entry<String, String> entry1 : map1.entrySet())
        {
            for(Map.Entry<String, String> entry3 : map3.entrySet())
            {
                if(entry1.equals(entry3))
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                }
            }
        }
        return flag;
    }
}