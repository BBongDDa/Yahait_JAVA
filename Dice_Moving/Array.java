import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		int[] keyboard = new int[5];
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		for(int i=0;i<5;i++) {
			keyboard[i] = input.nextInt();
			System.out.println(keyboard[i]);
			total = total + keyboard[i];
		}
		float avg = total/5;

		System.out.println("average : " + avg);
		
		input.close();
	}

}
