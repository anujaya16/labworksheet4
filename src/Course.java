class Course{
    private String name;
    private String enrollType;
    private int  numberOfStudentsEnrolled;
    private Lecturer  lecturerInCharge;
    private Degree  degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled, Lecturer lecturerInCharge, Degree degreeBelongsTo){
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturerInCharge = lecturerInCharge;
        this.degreeBelongsTo = degreeBelongsTo;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEnrollType(String enrollType){
        this.enrollType = enrollType;
    }

    public String getEnrollType(){
        return enrollType;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled){
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public int getNumberOfStudentsEnrolled(){
        return numberOfStudentsEnrolled;
    }

    public void  addLecturerInCharge(Lecturer lecturerInCharge){
        this.lecturerInCharge = lecturerInCharge;
    }

    public Lecturer getLecturerInCharge(){
        return lecturerInCharge;
    }

    void displayInfo(){
        System.out.println("Course name: " + name);
        System.out.println("lecturer in charge: " + lecturerInCharge);
    }



}