import java.io.PrintStream;

public class Student {
    private string studentID;
    private String name;

    public Student(String number, String 未知) {
        new Student("00000000", "未知");
    }

    public Student(String studentID) {
        new Student(studentID, "未知");
    }

    private Student(string studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public string getStudentID() {
        return  studentID;
    }

    public String getName() {
        return name;
    }

    public  Void setName(String name){
        this.name = name;
        return null;
    }

    public Void printData() {
        System.out.printf("%S %S", studentID, name)
        return null;
    }
}
