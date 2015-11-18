package challenges;

public class Human implements Person{

	String name, plea;
	int age;

  public Human(String name, int age){
  	this.name = name;
  	this.age = age;
  }

  public Human(String name, int age, String plea){
  	this.name = name;
  	this.age = age;
  	this.plea = plea;
  }

  @Override
  public boolean isDead(){
		return true;
	}
}
