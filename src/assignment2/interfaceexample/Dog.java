package assignment2.interfaceexample;

public class Dog implements AnimalInterface {

	@Override
	public boolean isDanger() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String foodType() {
		// TODO Auto-generated method stub
		return "Meat and Veg";
	}

	@Override
	public String habitat() {
		// TODO Auto-generated method stub
		return "Home";
	}


}
