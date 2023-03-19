package assignment2.abstractexample;

public abstract class AnimalAbstract {
	
	//Common Functionalities for child classes will be implemented in abstract classes
	public boolean protectKids() {
		return true;
	}
	
	public boolean haveFamily() {
		return true;
	}
	//Non Common Functionalities for child classes will be declared in abstract classes
	public abstract String foodType();
	public abstract String isDanger();

}
