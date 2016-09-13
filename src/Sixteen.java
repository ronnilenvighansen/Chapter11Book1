import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true
 * if no two keys map to the same value. For example,
 * {Marty=206-9024, Hawking=123-4567, Smith=949-0504, Newton=123-4567} should return false, but
 * {Marty=206-9024, Hawking=555-1234, Smith=949-0504, Newton=123-4567} should return true. The empty map is considered
 * 1-to-1 and returns true. */

public class Sixteen
{
    public static void main(String[] args)
    {
        Map<String, String> map1 = new TreeMap<>();
        Map<String, String> map2 = new TreeMap<>();
        map1.put("Marty", "206-9024");
        map1.put("Hawking", "123-4567");
        map1.put("Smith", "949-0504");
        map1.put("Newton", "123-4567");
        map2.put("Marty", "206-9024");
        map2.put("Hawking", "555-1234");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");
        System.out.println(is1to1(map1));
        System.out.println(is1to1(map2));
    }

    public static boolean is1to1(Map<String, String> map)
    {
        Map<String, String> newMap = new TreeMap<>();
        boolean flag = true;
        for(Map.Entry<String, String> entry : map.entrySet())
        {
            if(newMap.containsKey(entry.getKey()) || newMap.containsValue(entry.getValue()))
            {
                flag = false;
            }
            newMap.put(entry.getKey(), entry.getValue());
        }
        return flag;
    }
}
