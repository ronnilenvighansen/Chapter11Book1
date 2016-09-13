import java.util.*;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if no
 * two keys map to the same value (and false if any two or more keys do map to the same value). For example, if the map
  * contains the following key/value pairs, your method would return true:
  * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would
  * return false, because of two mappings for Perkins and Reges:
  * {Kenderick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}. */

public class Thirteen
{
    public static void main(String[] args)
    {
        Map<String, String> map = new TreeMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map)
    {
        Set<String> unique = new TreeSet<>();
        boolean flag = true;
        for(String name : map.values())
        {
            if(unique.contains(name))
            {
                flag = false;
            }
            unique.add(name);
        }
        return flag;
    }
}
