public class MainApp {
    public static void main(String[] args) {
        Person student = new Person();

        // access directly
        // student.name = "John";
        // System.out.println(student.name);
        // complie error: name has private access in Person

        // access via getter & setter
        student.setName("John");
        System.out.println("Student's name is " + student.getName());
        // Student's name is John
    }
}
