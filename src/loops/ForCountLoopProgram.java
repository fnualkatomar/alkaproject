package loops;

public class ForCountLoopProgram {

	public static void main(String[] args) {
		for (int i = 10; i>= 1; i--) {
			System.out.print(i + "->");
			for (int j = 10; j>= 1; j--) {
				System.out.print(j + ",");

			}
			System.out.println();

		}
	}
}