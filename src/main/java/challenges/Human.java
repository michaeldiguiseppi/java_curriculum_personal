package challenges;

public class Human implements Person{

	String name, plea;
	int age;
	boolean eaten;

  public Human(String name, int age){
  	this.name = name;
  	this.age = age;
  	this.eaten = false;
  }

  public Human(String name, int age, String plea){
  	this.name = name;
  	this.age = age;
  	this.plea = plea;
  	this.eaten = false;
  }

  @Override
  public boolean isDead(){
		if(this.eaten == true){
			return true;
		}
		return false;
	}
}
