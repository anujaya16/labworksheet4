public class UniversityManagementSystem {

        public static void main(String[] args) {

            Department deptcs = new Department("Computer Science", null);
            Department deptse = new Department("Software Engineering", null);

            Degree degreecs = new Degree("Bachelor of Computer Science", 70);
            Degree degreese = new Degree("Bachelor of Software Engineering", 80);

            Course course1 = new Course("Database Management", "cs",70, null, degreecs);
            Course course2 = new Course("Electronics", "se",80, null, degreese);

            Lecturer lecturer1 = new Lecturer("John wick", "Lecturer", deptcs);
            Lecturer lecturer2 = new Lecturer("Soo hyueon", "Lecturer", deptse);
            Lecturer lecturer3 = new Lecturer("Bruce Wayne", "Senior Lecturer", deptcs);

            Student student1 = new Student("Mad Max", "cs001", "2024", degreecs);
            Student student2 = new Student("Himura Kenshin", "cs002", "2024", degreecs);
            Student student3 = new Student("Gon", "cs003", "2024", degreese);

            deptcs.appointDepartmentHead(lecturer1);
            deptse.appointDepartmentHead(lecturer3);

            course1.addLecturerInCharge(lecturer3);

            deptcs.displayInfo();
            System.out.println();
            course1.displayInfo();
            System.out.println();
            student2.displayInfo();


        }


}



