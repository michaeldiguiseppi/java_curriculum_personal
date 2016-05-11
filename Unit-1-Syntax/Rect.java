public class Rect {
  public int width;
  public int length;

  public Rect(int width, int length) {
    this.width = width;
    this.length = length;
  }

  public int area() {
    return this.width * this.length;
  }

  public static void main(String [] args) {
    Rect myRect = new Rect(100, 100);

    System.out.println( myRect.area() );
  }

}
