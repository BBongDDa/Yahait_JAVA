
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
		
		System.out.println("[학생 관리 프로그램]");
		
		String num;
		String msg = "";
		while (true) { // equals = 비교		
			System.out.print("[전체조회, 추가, 검색, 삭제, 종료] 중 한가지를 입력하세요 : ");	
			num = sc.next();
			if (num.equals("전체조회")) { // ArrayList 전체 조회
				System.out.println("[학생 관리 - 전체조회]");
				for (Student s : list) {
					msg = "이름 : " + s.name + ", 학번 : " + s.number + ", 전공 : " + s.department;
					System.out.println(msg);
				}
				System.out.println();
				
			}else if (num.equals("추가")){ // 데이터 추가
				System.out.println("이름 : ");
				name = sc.next();
				System.out.println("학번 : ");
				number = sc.next();
				System.out.println("전공 : ");
				department = sc.next();
				student = new Student(name, number, department);	
				list.add(student);		
				System.out.println("추가되었습니다.");
				System.out.println();
					
			}else if (num.equals("검색")) { // 데이터 검색 (1개만)
				System.out.println("검색 학번 : ");	
				number = sc.next();
				for (Student s : list) {
					if (s.number.equals(number)) 
					{
						System.out.println("[검색결과]");
						System.out.println("이름 : " + s.name);
						System.out.println("학번 : " + s.number);
						System.out.println("전공 : " + s.department);
						System.out.println();
						System.out.println();
					}
				}
			}else if (num.equals("삭제")) { // 데이터 삭제
				System.out.println("삭제할 학번 : ");
				number = sc.next();
				for (Student s : list) {
					if (s.number.equals(number))
					{
						list.remove(s);
						System.out.println("삭제되었습니다.");
						System.out.println();
						break;
					}
				}
			}else if (num.equals("종료")) { // 프로그램 종료
				System.out.println("[학생 관리 프로그램]이 종료되었습니다.");
				System.out.println();
				return;
			}
					
			
		}
	}
}