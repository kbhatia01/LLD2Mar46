package src.Registry;

public class Main {

    public static void main() {

        Students s1 = new Students(1, "John", 20, "Computer Science");
        Students s2 = new Students(2, "Jane", 21, "Computer Science");
        Students s3 = new Students(3, "Bob", 22, "Computer Science");

        StudentRegistry registry = new StudentRegistry();
        registry.Register(s1);
        registry.Register(s2);
        registry.Register(s3);


        // start your application here

        // mark s1 present;

        Students s = registry.getStudents(2);
        if(s == null){
            System.out.println("Student not found");
        } else {

            System.out.println(s.name + "Marked present");
        }




    }
}
