import java.util.HashMap;

public class HashMaps {
  public static void main(String[] args) {
    HashMap<Integer, String> students = new HashMap<>();

    students.put(1, "Mike DiGuiseppi");
    students.put(2, "Dave Sudia");
    students.put(3, "Louisa Reese");
    students.put(4, "Kathy Dieser");
    students.put(5, "Danny Robinson");


    System.out.println("______ After Initial Add ______");

    for (Integer id : students.keySet()) {
      System.out.println(id + ". " + students.get(id));
    }

  }
}
