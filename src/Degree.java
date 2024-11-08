import java.util.ArrayList;

class Degree{

    private String name;
    private int  numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudents){
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<Course>();
    }
}