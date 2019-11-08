
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public String name;
	public String number;
	public String department;

	public Student(String name, String number, String department) {	
		this.name = name;
		this.number = number;
		this.department = department;
	}

	
	public static void main(String str[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student student;
		
		Scanner sc = new Scanner(System.in);
		String name;
		String number;
		String department;
		
		System.out.println("[�л� ���� ���α׷�]");
		
		String num;
		String msg = "";
		while (true) { // equals = ��		
			System.out.print("[��ü��ȸ, �߰�, �˻�, ����, ����] �� �Ѱ����� �Է��ϼ��� : ");	
			num = sc.next();
			if (num.equals("��ü��ȸ")) { // ArrayList ��ü ��ȸ
				System.out.println("[�л� ���� - ��ü��ȸ]");
				for (Student s : list) {
					msg = "�̸� : " + s.name + ", �й� : " + s.number + ", ���� : " + s.department;
					System.out.println(msg);
				}
				System.out.println();
				
			}else if (num.equals("�߰�")){ // ������ �߰�
				System.out.println("�̸� : ");
				name = sc.next();
				System.out.println("�й� : ");
				number = sc.next();
				System.out.println("���� : ");
				department = sc.next();
				student = new Student(name, number, department);	
				list.add(student);		
				System.out.println("�߰��Ǿ����ϴ�.");
				System.out.println();
					
			}else if (num.equals("�˻�")) { // ������ �˻� (1����)
				System.out.println("�˻� �й� : ");	
				number = sc.next();
				for (Student s : list) {
					if (s.number.equals(number)) 
					{
						System.out.println("[�˻����]");
						System.out.println("�̸� : " + s.name);
						System.out.println("�й� : " + s.number);
						System.out.println("���� : " + s.department);
						System.out.println();
						System.out.println();
					}
				}
			}else if (num.equals("����")) { // ������ ����
				System.out.println("������ �й� : ");
				number = sc.next();
				for (Student s : list) {
					if (s.number.equals(number))
					{
						list.remove(s);
						System.out.println("�����Ǿ����ϴ�.");
						System.out.println();
						break;
					}
				}
			}else if (num.equals("����")) { // ���α׷� ����
				System.out.println("[�л� ���� ���α׷�]�� ����Ǿ����ϴ�.");
				System.out.println();
				return;
			}
					
			
		}
	}
}