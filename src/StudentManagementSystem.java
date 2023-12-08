import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentManagementSystem implements StudentService {
    LinkedList<Student> linkedList = new LinkedList<>();
    @Override
    public String addStudent(Student student) {
        linkedList.add(student);
        return null;
    }

    @Override
    public List<Student> displayStudent() {
        return linkedList;
    }

    @Override
    public List<Student> sortbyName() {
        Comparator<Student> comparator = Comparator.comparing(Student::getName);
        linkedList.sort(comparator);
        return linkedList;

    }

    @Override
    public List<Student> sortbyGrades(String ascOrDesc) {
        Comparator<Student> comparator = Comparator.comparing(Student::getMark);
        if(ascOrDesc.equalsIgnoreCase("asc")){
            linkedList.sort(comparator);
            return linkedList;
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            linkedList.sort(comparator.reversed());
            return linkedList;
        }
        return null;
    }



}
