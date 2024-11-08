import java.util.ArrayList;

class Student extends Person{
    private String studentID;
    private String year;
    Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year, Degree degree){
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = new ArrayList<Course>();
    }

    public String getStudentID(){
        return studentID;
    }



    public String getName(){
        return super.getName();
    }

    public void displayInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println();
    }

}