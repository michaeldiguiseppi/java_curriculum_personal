import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
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
        // Set the name here.
        this.name = name;
        humans = new HashMap<>();
        humans.put("known", new ArrayList<>());
        humans.put("lastEaten", new ArrayList<>());
	}

    /**
	 * Constructor, initialize the zombie with a name and initial health.
	 * @param name
	 * @param health
     */
	public Zombie(String name, int health) {
        this(name); // This sets the name by calling the constructor above.
        // Set the health here
        this.health = health;
	}

    /**
     * When a Zombie comes across humans, it takes adds them to the "known" ArrayList in its humans HashMap.
     * @param humans The array of humans the zombie has seen.
     */
    public void search(Human[] humans) {
        // Add humans to "known" ArrayList here.
        for (Human human : humans) {
            this.humans.get("known").add(human);
        }

        this.humans.get("known").sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    /**
     * Loops through "known" humans and eats them, so they should now be inside the "lastEaten" ArrayList of the
     * humans HashMap
     */
    public void eat() {
        this.digest();
        while (!humans.get("known").isEmpty()) {
            humans.get("lastEaten").add(humans.get("known").get(0));
            humans.get("known").get(0).setEaten(true);
            humans.get("known").remove(0);
            this.health += 1;

        }
    }

    private void digest() {
        humans.get("lastEaten").clear();
    }

	@Override
	public boolean isDead(){
		return true;
	}

    public String getName() {
        return this.name;
    }
    public HashMap<String, ArrayList<Human>> getHumans() {
        return this.humans;
    }
    public int getHealth() {
        return this.health;
    }
}
