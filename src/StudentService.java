import java.util.List;

public interface StudentService {

    String addStudent(Student student);
    List<Student> displayStudent();
    List<Student> sortbyName();
    List<Student> sortbyGrades(String ascOrDesc);
}
