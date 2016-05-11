import java.util.ArrayList;

public class ArrayLists {
  public static void main(String [] args) {

    Student mike = new Student(1, "Mike", "DiGuiseppi");
    String mikeFullName = mike.getFullName();

    ArrayList<Student> students = new ArrayList<>();

    students.add(mike);
    students.add( new Student(2, "Louisa", "Reese") );

    System.out.println("_____ After add _____");
    for (Student student : students) {
      System.out.println(student.getId() + " " + student.getFullName());
    }
  }
}
