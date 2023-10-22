// Sort a list of strings in ascending order using a lambda expression.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings{
    public static void main(String [] args){
         List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("fig");
        Collections.sort(stringList,(s1,s2)->s1.compareTo(s2));
        for(String s:stringList){
            System.out.println(s);
        }
    }
}
