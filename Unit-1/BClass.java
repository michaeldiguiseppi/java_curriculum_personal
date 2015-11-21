class Foo {
  String awesomeDescription(){
    return "Foo";
  }
}

class Bar {
  String description(){
    return "Bar";
  }
}

class Printer {
  void print(Object o) {
    if (o instanceof Foo) {
      System.out.println(((Foo) o).awesomeDescription());
    } else if (o instanceof Bar) {
      System.out.println(((Bar) o).description());
    }
  }
}

class BClass {
  public static void main(String[] args){
    Printer printer = new Printer();
    printer.print(new Foo());
    printer.print(new Bar());
  }
}
