import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("ù ��° �����Է� : " );
		String input = sc.nextLine();
		System.out.println("+, -, *, / �� �ϳ��� �Է�  : ");
		String cal = sc.nextLine();
		System.out.println("�� ��° �����Է� : " );
		String input2 = sc.nextLine();
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		//����
		if(cal.equals("+")){
			int result = num + num2;
			System.out.println("�� ���� ���� " + result);
			System.out.println("");
		} 
                        //����
                          else if(cal.equals("-")){
			int result = num - num2;
			System.out.println("�� ���� ����� " + result);
			System.out.println("");
		} 
                        //����
                          else if(cal.equals("*")){
			int result = num * num2;
			System.out.println("�� ���� ���� " + result);
			System.out.println("");
		} 
                        //������
                          else if(cal.equals("/")){
			int result = num / num2;
			System.out.println("�� ���� ������� " + result);
			System.out.println("");
		}
		}
	}
}