import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if (o2.getStudentAge()==o1.getStudentAge()){
            if (o2.getStudentName()==o1.getStudentName()){
              return o2.getStudentID()-o1.getStudentID();
            }
            return o2.getStudentName().compareTo(o1.getStudentName());
        }
        return o2.getStudentAge()-o1.getStudentAge();

    }
}
