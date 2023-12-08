import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentManagementSystem();

        Student student = new Student("Mika","Java",5);
        Student student1 = new Student("Gulumkan","Java",4);
        Student student2 = new Student("Aiturgan","Java",5);
        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        System.out.println(studentService.displayStudent());
        System.out.println(studentService.sortbyName());
        System.out.println(studentService.sortbyGrades("asc"));
        System.out.println(studentService.sortbyGrades("desc"));


//        LinkedList<String> link = new LinkedList<>(Arrays.asList("Mika","Aiturgan","Gulumkan","Kasym"));
//        LinkedList<String> link1 = new LinkedList<>(Arrays.asList("Mika","Aiturgan","Gulumkan","Kanat"));
//
//
//        System.out.println(link.getFirst());
//        System.out.println(link.getLast());
//
//        for (int i = 0; i < link.size(); i++) {
//            if(link.get(i).contains("Kasym")){
//                System.out.println("Yes we have!");
//            }
//        }
//
//        String[]  students = new String[4];
//        for (int i = 0; i < students.length; i++) {
//           System.out.println(students[i] = link.get(i));
//        }
//
//        for (int i = 0; i < link.size(); i++) {
//            for (int j = 0; j < link1.size(); j++) {
//                if(link.size()==link1.size()){
//                    System.out.println("BARARBAR");
//                }else System.out.println("  Barabar emes");
//            }
//        }
//
//        for (int i = 0; i < link.size(); i++) {
//            if(!link.get(i).isEmpty()){
//                System.out.println("Not empty");
//            }else System.out.println("Empty");
//        }
//
//        link.set(1,"Alina");
//        System.out.println(link);

    }
}