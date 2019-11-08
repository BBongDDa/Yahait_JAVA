import java.util.Scanner;

public class Dice{

	public static void main(String[] args){
		Dicemoving diceClass = new Dicemoving();
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt();
		for(int i=0; i<count; i++) {
			diceClass.Dicemoving1();
		}
		
		input.close();
	}

}
