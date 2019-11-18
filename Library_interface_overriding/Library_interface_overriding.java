import java.util.ArrayList; 
import java.util.Scanner;

interface bookstatus{
	public int max_deadline = 14; //대출기한 14일(2주)
	public void setBook(Borrow borrow);
	public void Listup(int nowday);
	public void Search(String bname, int nowday);
	public void Return(String bname);
}

class Borrow implements bookstatus{
	String msg;
	String bookname, name, bname; //책 제목,책 저자,빌린 사람
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
	public void Listup(int nowday) { // 전체출력
		System.out.println("[대출 상황 출력]");
		for (Borrow l: list) {
			cal_borrowday = max_deadline-(nowday-l.day);
			msg = "[책 이름] " + l.bookname + " [저자 명] " + l.name + " [대출자] " + l.bname +" [반납 기한] " + cal_borrowday + "일 남음" ;
			System.out.println(msg);
		}
	}
	
	@Override
	public void Search(String bname, int nowday) { // 검색
		System.out.println("[검색 결과]");
		int count = 0;
		for (Borrow l: list) {
			if (bname.equals(l.bname)) {	
				cal_borrowday = max_deadline-(nowday-l.day);
				System.out.println("제목 : " + l.bookname);
				System.out.println("저자 : " + l.name);
				if (cal_borrowday>=0) {
					System.out.println("대출기간 : " + (cal_borrowday) + "일 남음");
				}else {
					System.out.println("대출기간 : " + (cal_borrowday) + "일 연체");
				}
				System.out.println();
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("검색 결과가 없습니다!");
		}else {
			System.out.println(count + "건이 검색되었습니다!");
		}
	}
	
	@Override
	public void Return(String bname) { // 반납(삭제)
		System.out.println("[반납 결과]");
		int count = 0;
		for (Borrow l: list) {
			if (bname.equals(l.bname)) {
				//list.remove(l); //구현못함
				count += 1;
			}
		}
		if (count == 0) {
			System.out.println("반납할 책이 없습니다!");
		}else {
			System.out.println(count + "건이 반납 처리 되었습니다!");
		}
	}
	
}

public class Library extends Borrow{ 
	
	public static void main(String[] args) {
		int day = 0; //프로그램상 가상 날짜 카운트
		int count = 0; //대출 시스템이 3건 발생할 때마다 day를 하나 추가
		int input = 0;
		String bookname, name, bname; //책 제목, 책 저자, 빌린 사람
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[SY 도서관]");
		
		Borrow b = new Borrow();
		
		while (true){
			// 가상 날짜 카운트
			if (count == 3) {
				count = 0;
				day += 1;
			}
			
			System.out.println("[도서 대출 시스템]");
			System.out.print("[1 추가, 2 검색, 3 삭제, 4 대출상황, 5 종료] = ");
			
			input = sc.nextInt();
			
			
			if (input == 1) {
				System.out.println("1) 데이터 추가");
				System.out.print("대출할 책 제목 : ");
				bookname = sc.next();
				System.out.print("저자 : ");
				name = sc.next();
				System.out.print("대출자 이름 : ");
				bname = sc.next();
				
				Borrow borrow = new Borrow(bookname,name,bname,day);
				b.setBook(borrow);
				
			}else if (input == 2) {
				System.out.println("2) 대출  검색");
				
				System.out.print("대출자 이름 : ");
				bname = sc.next();
				b.Search(bname,day);
				
			}else if (input == 3) { // 구현못함
				System.out.println("3) 반납 (삭제)");
				
				System.out.print("대출자 이름 : ");
				bname = sc.next();
				b.Return(bname);
				
			}else if (input == 4) { 
				System.out.println("4) 대출 상황");
				b.Listup(day);
				
			}else if (input == 5) {
				System.out.println("[시스템 종료] 감사합니다.");
				break;
			}else {
				System.out.println("error!");
			}
			System.out.println();
			count += 1; // 발생 건수 카운트
			
		}
		
		sc.close();
	}
}
