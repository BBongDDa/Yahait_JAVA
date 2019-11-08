import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("첫 번째 숫자입력 : " );
		String input = sc.nextLine();
		System.out.println("+, -, *, / 중 하나를 입력  : ");
		String cal = sc.nextLine();
		System.out.println("두 번째 숫자입력 : " );
		String input2 = sc.nextLine();
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		//덧셈
		if(cal.equals("+")){
			int result = num + num2;
			System.out.println("두 수의 합은 " + result);
			System.out.println("");
		} 
                        //뺄셈
                          else if(cal.equals("-")){
			int result = num - num2;
			System.out.println("두 수의 빼기는 " + result);
			System.out.println("");
		} 
                        //곱셈
                          else if(cal.equals("*")){
			int result = num * num2;
			System.out.println("두 수의 곱은 " + result);
			System.out.println("");
		} 
                        //나눗셈
                          else if(cal.equals("/")){
			int result = num / num2;
			System.out.println("두 수의 나누기는 " + result);
			System.out.println("");
		}
		}
	}
}