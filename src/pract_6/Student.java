package pract_6;

public class Student implements Comparable<Student>{
    private int idNum;
    private int GPA;

    public Student(int idNum, int GPA) {
        this.idNum = idNum;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNum=" + idNum +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // < 0 -> o, 0 -> ==, >0 -> this;
        return this.GPA - o.GPA;
    }}
