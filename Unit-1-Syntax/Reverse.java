

public class Reverse {

  public static String reverse(String str) {
    int i, len = str.length();
    String reversedString = "";
    for (i = (len - 1); i >= 0; i--) {
      reversedString += str.charAt(i);
    }
    return reversedString;
  }

  public static void main(String[] args) {
    System.out.println(reverse(args[0]));
  }

}
