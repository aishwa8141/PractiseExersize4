

import java.util.*;

public class ImplementSetInterface {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter n");
        int x = input.nextInt();
        input.nextLine();
        System.out.println("enter the string");
        for(int i=0;i<x;i++)
        set.add(input.nextLine());
        System.out.println(set);
        List<String> list=new ArrayList<>(set);
        System.out.println("Array list after sorting "+list);
        list.clear();
        int size=list.size();
        System.out.println(size);

    }


}
