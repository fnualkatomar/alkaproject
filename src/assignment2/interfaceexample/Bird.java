package assignment2.interfaceexample;

public class Bird implements AnimalInterface{

	@Override
	public boolean isDanger() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String foodType() {
		// TODO Auto-generated method stub
		return "Seeds";
	}

	@Override
	public String habitat() {
		// TODO Auto-generated method stub
		return "Tree";
	}


}
