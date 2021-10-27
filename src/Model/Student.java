package Model;

public class Student extends Person{
    private double mathsGrade;
    private double physicsGrade;
    private double chemistryGrade;

    public Student() {
    }

    public Student( String fullName, int age, double mathsGrade, double physicsGrade, double chemistryGrade) {
        super(fullName, age);
        this.mathsGrade = mathsGrade;
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrade;
    }

    public double getMathsGrade() {
        return mathsGrade;
    }

    public void setMathsGrade(double mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public double calAverageMark(){
        return (mathsGrade+physicsGrade+chemistryGrade)/3;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id= " + getId() +
                ", FullName='" + getFullName() + '\'' +
                ", age= " + getAge() +
                "mathsGrade= " + mathsGrade +
                ", physicsGrade= " + physicsGrade +
                ", chemistryGrade= " + chemistryGrade +
                ", averageMark= "+ calAverageMark()+
                '}';
    }
}
