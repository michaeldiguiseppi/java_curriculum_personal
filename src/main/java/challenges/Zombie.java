package challenges;
import java.util.HashMap;

public class Zombie implements Person{

	String name;
	int health;
	Human[] knownHumans;
	String[] victimPleas;
	HashMap<String, Human[]> stomachContents = new HashMap<String, Human[]>();

  // Override isDead() function from Person class
	@Override
	public boolean isDead(){
		return true;
	}
}
