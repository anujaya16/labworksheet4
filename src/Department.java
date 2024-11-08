import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer>  lecturersBelongsTo;

    public Department(String name, Lecturer departmentHead) {
        this.name = name;
        this.departmentHead = departmentHead;

    }

    public void displayInfo(){
        System.out.println("Department name: " + this.name);
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    public void  appointDepartmentHead(Lecturer departmentHead){
        this.departmentHead = departmentHead;
    }
    public Lecturer getDepartmentHead(){
        return this.departmentHead;
    }

    void  displayDepartmentHeadInfo(){
        System.out.println("Department head name: " + this.departmentHead);
    }
    void offerCourse(){
        System.out.println("Course offered ");
    }
    void  withdrawCourse(){
        System.out.println("Course withdrawn ");
    }
    void  addLecturer(){
        System.out.println("Lecturer added");
    }

    void removeLecturer(){
        System.out.println("Lecturer removed");
    }




}


