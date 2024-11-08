import java.util.ArrayList;

class Lecturer extends Person {

    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }



    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }


    public void displayDepartmentInfo(){
        department.displayInfo();
    }

    void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("position: " + position);
        System.out.println("Department: " + department);
        System.out.println();
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }
    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        System.out.println("Courses Teaching:");
        for (Course course : coursesTeaching) {
            course.displayInfo();
        }
    }
}
