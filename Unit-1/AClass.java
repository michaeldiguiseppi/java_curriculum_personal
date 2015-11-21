class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  }
}

class MountainBike extends Bicycle {
  void changeCadence(int newValue) {
    cadence = newValue * 20;
  }
}

interface Cycle {
  void changeCadence(int newValue);
}

class Unicycle implements Cycle {
  int cadence = 0;
  public void changeCadence(int newValue) {
    cadence = 45;
  }
}

class AClass {
  public static void main(String[] args){

    int[][] data = {
      {1,2},
      {3,4}
    };

    System.out.println(data.length);
  }
}
