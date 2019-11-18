import java.util.ArrayList; 
import java.util.Scanner;

interface bookstatus{
	public int max_deadline = 14; //������� 14��(2��)
	public void setBook(Borrow borrow);
	public void Listup(int nowday);
	public void Search(String bname, int nowday);
	public void Return(String bname);
}

class Borrow implements bookstatus{
	String msg;
	String bookname, name, bname; //å ����,å ����,���� ���
	int day, cal_borrowday;
	ArrayList<Borrow> list = new ArrayList<Borrow>();

	public Borrow (String bookname, String name, String bname, int day) {
		this.bookname = bookname.toString();
		this.name = name.toString();
		this.bname = bname.toString();
		this.day = day;
	}
	
	public Borrow () {
	}
	
	@Override
	public void setBook(Borrow borrow) {
		list.add(borrow);
	}
	
	@Override
	public void Listup(int nowday) { // ��ü���
		System.out.println("[���� ��Ȳ ���]");
		for (Borrow l: list) {
			cal_borrowday = max_deadline-(nowday-l.day);
			msg = "[å �̸�] " + l.bookname + " [���� ��] " + l.name + " [������] " + l.bname +" [�ݳ� ����] " + cal_borrowday + "�� ����" ;
			System.out.println(msg);
		}
	}
	
	@Override
	public void Search(String bname, int nowday) { // �˻�
		System.out.println("[�˻� ���]");
		int count = 0;
		for (Borrow l: list) {
			if (bname.equals(l.bname)) {	
				cal_borrowday = max_deadline-(nowday-l.day);
				System.out.println("���� : " + l.bookname);
				System.out.println("���� : " + l.name);
				if (cal_borrowday>=0) {
					System.out.println("����Ⱓ : " + (cal_borrowday) + "�� ����");
				}else {
					System.out.println("����Ⱓ : " + (cal_borrowday) + "�� ��ü");
				}
				System.out.println();
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("�˻� ����� �����ϴ�!");
		}else {
			System.out.println(count + "���� �˻��Ǿ����ϴ�!");
		}
	}
	
	@Override
	public void Return(String bname) { // �ݳ�(����)
		System.out.println("[�ݳ� ���]");
		int count = 0;
		for (Borrow l: list) {
			if (bname.equals(l.bname)) {
				//list.remove(l); //��������
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("�ݳ��� å�� �����ϴ�!");
		}else {
			System.out.println(count + "���� �ݳ� ó�� �Ǿ����ϴ�!");
		}
	}
	
}

public class Library extends Borrow{ 
	
	public static void main(String[] args) {
		int day = 0; //���α׷��� ���� ��¥ ī��Ʈ
		int count = 0; //���� �ý����� 3�� �߻��� ������ day�� �ϳ� �߰�
		int input = 0;
		String bookname, name, bname; //å ����, å ����, ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[SY ������]");
		
		Borrow b = new Borrow();
		
		while (true){
			// ���� ��¥ ī��Ʈ
			if (count == 3) {
				count = 0;
				day += 1;
			}
			
			System.out.println("[���� ���� �ý���]");
			System.out.print("[1 �߰�, 2 �˻�, 3 ����, 4 �����Ȳ, 5 ����] = ");
			
			input = sc.nextInt();
			
			
			if (input == 1) {
				System.out.println("1) ������ �߰�");
				System.out.print("������ å ���� : ");
				bookname = sc.next();
				System.out.print("���� : ");
				name = sc.next();
				System.out.print("������ �̸� : ");
				bname = sc.next();
				
				Borrow borrow = new Borrow(bookname,name,bname,day);
				b.setBook(borrow);
				
			}else if (input == 2) {
				System.out.println("2) ����  �˻�");
				
				System.out.print("������ �̸� : ");
				bname = sc.next();
				b.Search(bname,day);
				
			}else if (input == 3) { // ��������
				System.out.println("3) �ݳ� (����)");
				
				System.out.print("������ �̸� : ");
				bname = sc.next();
				b.Return(bname);
				
			}else if (input == 4) { 
				System.out.println("4) ���� ��Ȳ");
				b.Listup(day);
				
			}else if (input == 5) {
				System.out.println("[�ý��� ����] �����մϴ�.");
				break;
			}else {
				System.out.println("error!");
			}
			System.out.println();
			count += 1; // �߻� �Ǽ� ī��Ʈ
			
		}
		
		sc.close();
	}
}
