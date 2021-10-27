import Model.Student;
import Service.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement=new StudentManagement();

        studentManagement.add(new Student("hvi",10,9,3,5));
        studentManagement.add(new Student("hoang vi",12,9,6,10));
        studentManagement.add(new Student("vi hoangf",15,10,10,5));
        studentManagement.add(new Student("hviiiiii",8,10,5,8));
        studentManagement.printStudentList();

        studentManagement.editById(3,"new hvi",18,9,8,7);
        System.out.println("Student list after editing student id 3: ");
        studentManagement.printStudentList();

        studentManagement.removeById(1);
        System.out.println("Student list after removing student id 1: ");
        studentManagement.printStudentList();

        System.out.println("Student list after sorting by average mark: ");
        studentManagement.printSortedList();

        System.out.println("Student with top mark: ");
        System.out.println(studentManagement.findStudentWithTopMark());
    }
}
