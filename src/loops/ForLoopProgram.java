package loops;

public class ForLoopProgram {
public static void main(String[]args) {
	ForLoopProgram myObj = new ForLoopProgram();
	myObj.multiplicationTable(4, 20);
	myObj.multiplicationTable(8, 20);
	
}
  
// This method is to display the multiplication table of a given number till a given number
	void multiplicationTable( int i,int endnumber)	{
	 
		for(int j=1;j<=endnumber;j++) {
			int k =i*j;
			System.out.println(i+"*"+j+" = "+k);
		}
  }
}
	
	

