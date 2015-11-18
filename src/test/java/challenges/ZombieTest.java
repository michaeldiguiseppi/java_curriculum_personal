package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZombieTest {

    @Test
    public void createZombie_ShouldHaveName() {
    	Zombie zombie = new Zombie("Killer");
	    assertEquals("Killer", zombie.name);
    }

    @Test
    public void search_ShouldReturnArrayOfHumans() {
    	Zombie zombie = new Zombie("Runner");

    	Human a = new Human("Brooks", 34);
    	Human b = new Human("Akyuna", 21);
    	Human c = new Human("Jeff", 36);
    	Human d = new Human("Fabio", 28);
    	Human e = new Human("Luke", 36);
    	Human[] humans = {a,b,c,d,e};

    	zombie.search(humans);

    	assertEquals("Fabio", zombie.knownHumans[3].name);
    }

    @Test
    public void search_ShouldFindYoungestHuman() {

    	Zombie zombie = new Zombie("Runner");

    	Human a = new Human("Brooks", 34);
    	Human b = new Human("Akyuna", 21);
    	Human c = new Human("Jeff", 36);
    	Human d = new Human("Fabio", 28);
    	Human e = new Human("Luke", 36);
    	Human[] humans = {a,b,c,d,e};

    	zombie.search(humans);

    	assertEquals("Akyuna", zombie.knownHumans[0].name);

    }

    @Test
    public void eat_ShouldReturnEmptyArray() {
    	Zombie zombie = new Zombie("Eater");

    	Human a = new Human("Brooks", 34);
    	Human b = new Human("Akyuna", 21);
    	Human[] humans = {a,b};

    	zombie.search(humans);
    	zombie.eat();

    	assertEquals(0, zombie.knownHumans.length);
    }

    @Test
    public void eat_ShouldGainHealth() {
    	Zombie zombie = new Zombie("Eater", 2);

    	Human a = new Human("Brooks", 34);
    	Human b = new Human("Akyuna", 21);
    	Human[] humans = {a,b};

    	zombie.search(humans);
    	zombie.eat();

    	assertEquals(0, zombie.knownHumans.length);
    	assertEquals(3, zombie.health);
    }

    // @Test
    // public void eat_ShouldHearVictimsPlea() {
    // 	Zombie zombie = new Zombie("Eater", 2);

    // 	Human a = new Human("Brooks", 34, "Help help help. Stop eating me.");
    // 	Human b = new Human("Akyuna", 21, "Oh God, why? How did my life come to this?");

    // 	zombie.search(humans);
    // 	zombie.eat();

    // 	assertEquals("Oh God, why? How did my life come to this?", zombie.eat());

    // }

    @Test
    public void recall_shouldListPleasOfVictims() {
    	
    }

}
