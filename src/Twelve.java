import java.util.*;

/**
 * Created by Ronni on 02-09-2016.
 */

/* Write a method contains3 that accepts a list of strings as a parameter and returns true if any single string occurs
 * at least 3 times in the list, and false otherwise. Use a map as auxiliary storage. */

public class Twelve
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        list.add("bob");
        list.add("jane");
        list.add("james");
        list.add("bob");
        list.add("walter");
        list.add("bob");
        System.out.println(contains3(getWordCountMap(list, map)));
    }

    public static Map<String, Integer> getWordCountMap(List<String> list, Map<String, Integer> wordCountMap)
    {
        for(String word : list)
        {
            if(wordCountMap.containsKey(word))
            {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
            else
            {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }

    public static boolean contains3(Map<String, Integer> wordCountMap)
    {
        boolean flag = false;
        for(String word : wordCountMap.keySet())
        {
            int count = wordCountMap.get(word);
            if(count >= 3)
            {
                flag = true;
            }
        }
        return flag;
    }
}
