import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {

    public static void main(String[] ags){
         Student s1 = new Student(12,"alice",23);
         Student s2 = new Student(13,"hob",24);
         Student s3 = new Student(13,"alice",23);
         Student s4 = new Student(15,"aswath",34);
         Student s5 = new Student(16,"soundu",18);
        List<Student> list = new ArrayList<Student>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list,new StudentSorter());
        System.out.println(list.toString());

    }




}
