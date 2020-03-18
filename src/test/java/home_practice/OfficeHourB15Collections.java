package home_practice;
import java.util.*;

public class OfficeHourB15Collections {
    public static void main(String[] args) {
        /*
            Under List Interface:
            - ArrayList (indexes, faster to read, slower when we
            do manipulations(remove or add elements))
            - Vector (same as ArrayList, but thread safe)
                - Stack (Last in First out (like a stack of paper))
            - LinkedList (node (each element reference to previous
            and next element in the list))
            (performance-sensitive, memory allocation)
            [2, 5, 3] -> [2, 3]
            [2] [5] [3]
         */
        /*
            Set Interface: (contain only unique values)
            HashSet: no indexes - faster because it is using hashing
            (it does not keep an order), allows 1 null
            TreeSet: sorted set - no nulls
            LinkedHashSet: keeps the order
         */
        HashSet <String> hashSet = new HashSet<>();
        TreeSet <String> treeSet = new TreeSet<>();
        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>();
        for (String each : Arrays.asList("Value2", "Value3", "Value1")){
            hashSet.add(each);
            treeSet.add(each);
            linkedHashSet.add(each);
        }
        System.out.println("hashset: " + hashSet);
        System.out.println("treeset: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);


        Iterator<String> iteratorSet = hashSet.iterator();
        while(iteratorSet.hasNext()){
            System.out.println(iteratorSet.next());
        }
        ArrayList<Integer> dropdown = new ArrayList<>();
        dropdown.add(1);
        dropdown.add(2);
        dropdown.add(3);
        dropdown.add(4);
        dropdown.add(5);
        dropdown.add(1);


        //[1,2,3,4,5]
        System.out.println("list = " + dropdown);
        HashSet<Integer> optionsSet = new HashSet<>(dropdown);
        System.out.println("optionsSet = " + optionsSet);

        if(optionsSet.size()==dropdown.size()){
            System.out.println("expected is the same as actual");
        }else{
            System.out.println("options contains duplicates");
        }




    }
}
