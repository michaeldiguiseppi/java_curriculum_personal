package challenges;

public class Zombie implements Person{

	String name;
	int health;
	Human[] knownHumans;
	String[] victimPleas;

	// Constructor
	public Zombie(String name){
		this.name = name;
		this.health = 0;
	}

	public Zombie(String name, int health){
		this.name = name;
		this.health = health;
	}

	public void search(Human[] humans){
		// Human[] ageSortedHumans = new Human[humans.length];

		// for(int i = 0; i < humans.length; i++){
		// 	for(int j = i+1; j < humans.length; j++){
		// 		Human temp = null;
		// 		if(humans[i].age < humans[j].age){
		// 			temp = humans[i];
		// 			humans[i] = humans[j];
		// 			humans[j] = temp;
		// 		}			
		// 	}
		// }
		// this.knownHumans = ageSortedHumans; 
		this.knownHumans = humans;
	}

	@Override
	public boolean isDead(){
		return true;
	}

	public String eat(){
		Human youngestHuman = knownHumans[0];
		this.knownHumans = new Human[0];
		health++;

		return youngestHuman.plea;
	}

	// public String[] recall() {
		


	// 	return new String[]{'not', 'working', 'yet'}

	// }

}
