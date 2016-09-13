import java.util.ArrayList;

/**
 * Created by Ronni on 30-08-2016.
 */

/* Write a method called alternate that accepts two lists as its parameters and returns a new List containing
alternating elements from the two lists, in the following order:
First element from first list
First element from second list
Second element from first list
Second element from second list
Third element from first list
Third element from second list
...
If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed
consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of
[6, 7, 8, 9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing
[1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12].

 */

public class Two
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        add(list1, 1, 5);
        add(list2, 6, 12);
        alternate(list1, list2, list3);
        System.out.println(list3);
    }

    public static ArrayList<Integer> add(ArrayList<Integer> list, int n1, int n2)
    {
        for(int i = n1; i <= n2; i++)
        {
            list.add(i);
        }
        return list;
    }

    public static ArrayList<Integer> alternate(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3)
    {
        if(list1.size() >= list2.size())
        {
            for(int i = 0; i < list2.size(); i++)
            {
                list3.add(list1.get(i));
                list3.add(list2.get(i));
            }
            for(int i = list2.size(); i < list1.size(); i++)
            {
                list3.add(list1.get(i));
            }
        }
        else
        {
            for(int i = 0; i < list1.size(); i++)
            {
                list3.add(list1.get(i));
                list3.add(list2.get(i));
            }
            for(int i = list1.size(); i < list2.size(); i++)
            {
                list3.add(list2.get(i));
            }
        }
        return list3;
    }
}