package Model;

public class Person {
    private int id;
    private String fullName;
    private int age;
    private static int studentNo = 0;

    public Person() {
        studentNo++;
        id = studentNo;
    }

    public Person(String fullName, int age) {
        studentNo++;
        this.id = studentNo;
        this.fullName = fullName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", FullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
