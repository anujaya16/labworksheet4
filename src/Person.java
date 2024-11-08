abstract class Person{

    private String name;

    public String toString() {
        return name;
    }

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    void displayInfo(){
        System.out.println(name);
    }
}