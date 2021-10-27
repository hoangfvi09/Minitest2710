package Service;

import Model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement {
    private ArrayList<Student> studentList;

    public StudentManagement(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentManagement() {
        studentList = new ArrayList<>(10);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


    public void add(Student student) {
        studentList.add(student);
    }

    public Student findStudentById(int id) {
        return studentList.get(findIndexById(id));
    }

    public void editById(int id, String name, int age, double maths, double physics, double chemistry) {
        studentList.get(findIndexById(id)).setFullName(name);
        studentList.get(findIndexById(id)).setAge(age);
        studentList.get(findIndexById(id)).setMathsGrade(maths);
        studentList.get(findIndexById(id)).setPhysicsGrade(physics);
        studentList.get(findIndexById(id)).setChemistryGrade(chemistry);

    }

    public void removeById(int id) {
        studentList.remove(findStudentById(id));

    }

    public void printSortedList() {
        studentList.sort(Comparator.comparingDouble(Student::calAverageMark));
        printStudentList();
    }

    public Student findStudentWithTopMark() {
        double topMark = 0;
        int topMarkIndex = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (topMark < studentList.get(i).calAverageMark()) {
                topMarkIndex = i;
            }
        }
        return studentList.get(topMarkIndex);
    }

    public void printStudentList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------------------");
    }


}
