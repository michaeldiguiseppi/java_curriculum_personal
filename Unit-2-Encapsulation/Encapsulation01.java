package galvanize;

public class Proposal {
  String name = "";
  private int allInFavor = 0;
}

public class Encapsulation01 {
  public static void main(String[] args){
    Proposal prop = new Proposal();
    prop.name = "Some thing";
    System.out.println(prop.name);

    prop.allInFavor = 24;
    System.out.println(prop.allInFavor);
  }
}
