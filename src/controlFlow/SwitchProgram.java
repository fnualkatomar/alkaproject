package controlFlow;

public class SwitchProgram {

	static void getEnergyefficiency(char catogory) {

		switch (catogory) {
		case 'a':
			System.out.println("Energy efficiency is very low");
			break;
		case 'B':
			System.out.println("Energy efficiency is  low");
			break;
		case 'C':
			System.out.println("Energy efficiency is normal");
			break;
		case 'D':
			System.out.println("Energy efficiency is high");
			break;
		case 'E':
			System.out.println("Energy efficiency is very high");
			break;
		default:
			System.out.println("i am in default");
		
		
		}

	}
}