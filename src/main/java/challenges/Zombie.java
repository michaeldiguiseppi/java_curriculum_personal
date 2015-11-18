package challenges;

public class Zombie implements Person{

	String name;
	int health;
	Human[] knownHumans;
	String[] victimPleas;

	// Constructors
	public Zombie(String name){
		this.name = name;
		this.health = 0;
	}

	public Zombie(String name, int health){
		this.name = name;
		this.health = health;
	}

	// Method to search through humans, finding the youngest human
	public void search(Human[] humans){
		Human temp = null;


		for(int i = 0; i < humans.length-1; i++){
			for(int j = 1; j < humans.length-i; j++){
				if(humans[j-1].age > humans[j].age){
					temp = humans[j-1];
					humans[j-1] = humans[j];
					humans[j] = temp;
				}			
			}
		}
		this.knownHumans = humans; 
	}


	public String eat(){
		Human youngestHuman = knownHumans[0];
		this.knownHumans = new Human[0];
		health++;

		// System.out.println(youngestHuman.plea);
		// System.out.println(knownHumans[0].name);


		return youngestHuman.plea;
		// return knownHumans[0];
	}

	// public String[] recall() {
		


	// 	return new String[]{'not', 'working', 'yet'}

	// }

	@Override
	public boolean isDead(){
		return true;
	}
}
