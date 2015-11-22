import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

  @Test
  public void ShouldFillWithGas() {
    Car car = new Car(10);
    assertEquals(0, car.gallons);

    car.fill(5);
    assertEquals(5, car.gallons);

    car.fill(6);
    assertEquals(11, car.gallons);
  }

  @Test
  public void ShouldUseGasWhenDriving() {
    Car car = new Car(10);

    car.fill(10);
    assertEquals(10, car.gallons);

    car.drive(50);
    assertEquals(5, car.gallons);
  }

  @Test
  public void ShouldIncrementOdometerWhenDriving() {
    Car car = new Car(10);
    assertEquals(0, car.odometer);

    car.drive(50);
    assertEquals(50, car.odometer);

    car.drive(25);
    assertEquals(75, car.odometer);
  }

  @Test
  public void ShouldRecordTripsWhenDriving() {
    Car car = new Car(10);
    assertEquals(0, car.trips.size());

    car.drive(50);
    assertEquals("[50 miles]", car.trips.toString());

    car.drive(25);
    assertEquals("[50 miles, 25 miles]", car.trips.toString());
  }

}
