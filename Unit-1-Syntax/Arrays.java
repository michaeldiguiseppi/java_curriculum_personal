public class Arrays {
  public static void main(String [] args) {
    String[] names = new String[] { "Su", "Will", };
    System.out.println(names[1]);

    String[][] fullNames = new String [][] {
      {"First", "Su"},
      {"Last", "Sylvester"},
    };
    System.out.println(fullNames[1][1]);
    int [] myIntArr = new int [10];
    System.out.println(myIntArr.length);
    String [] starWars = new String[] {"Han Solo", "Luke Skywalker", "R2D2", "C3PO"};
    System.out.println(starWars[2]);
    for (int i = 0; i < starWars.length; i++) {
      System.out.println("Character: " + starWars[i]);
    }
  }
}
