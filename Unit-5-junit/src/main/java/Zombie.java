import java.util.ArrayList;
import java.util.HashMap;

public class Zombie implements Person{

	/**
	 * The name of the zombie.
	 */
	private String name;
	/**
	 * The amount of health the zombie has.
	 */
	private int health;
	/**
	 * The humans he has come across.
	 */
	private HashMap<String, ArrayList<Human>> humans;

	/**
	 * Constructor, initializes the zombie with a name as well as our ArrayLists and HashMaps
	 * @param name
     */
	public Zombie(String name){
        // Set name variable here.
        humans = new HashMap<>();
        humans.put("known", new ArrayList<>());
        humans.put("eaten", new ArrayList<>());
	}

	/**
	 * Constructor, initialize the zombie with a name and initial health.
	 * @param name
	 * @param health
     */
	public Zombie(String name, int health) {
        this(name);
        // Set health variable here.
	}

	@Override
	public boolean isDead(){
		return true;
	}
}
