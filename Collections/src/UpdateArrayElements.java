import java.util.ArrayList;

import java.util.List;


public class UpdateArrayElements {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("grape");
        list.add("melon");
        list.add("orange");
        System.out.println("input" +list);
        list.set(1,"kiwi");
        list.set(3,"berry");
        System.out.println("output" +list);
        list.removeAll(list);
        System.out.println("Array list after removing all elements "+list);




    }

}
