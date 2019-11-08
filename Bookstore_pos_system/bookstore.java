
import java.util.Scanner;

public class Bookstore {

   public static void main(String[] args) {
      Scanner Input_Bookname = new Scanner(System.in);
      Scanner Input_Bookprice = new Scanner(System.in);
      int A, B, C, D, E;
      result S = new result();
      String name1, name2, name3, name4, name5;
      System.out.println("책의 제목을 입력해주세요 (1/5) : ");
      name1 = Input_Bookname.nextLine();
      System.out.println("가격을 입력해주세요 (원): ");
      A = Input_Bookprice.nextInt();
      System.out.println("책의 제목을 입력해주세요 (2/5) : ");
      name2 = Input_Bookname.nextLine();
      System.out.println("가격을 입력해주세요 (원): ");
      B = Input_Bookprice.nextInt();
      System.out.println("책의 제목을 입력해주세요 (3/5) : ");
      name3 = Input_Bookname.nextLine();
      System.out.println("가격을 입력해주세요 (원): ");
      C = Input_Bookprice.nextInt();
      System.out.println("책의 제목을 입력해주세요 (4/5) : ");
      name4 = Input_Bookname.nextLine();
      System.out.println("가격을 입력해주세요 (원): ");
      D = Input_Bookprice.nextInt();
      System.out.println("책의 제목을 입력해주세요 (5/5) : ");
      name5 = Input_Bookname.nextLine();
      System.out.println("가격을 입력해주세요 (원): ");
      E = Input_Bookprice.nextInt();
      Input_Bookname.close();
      Input_Bookprice.close();
      S.Book_Info(name1, name2, name3, name4, name5, A, B, C, D, E);
      S.result_print();
      
      
   }
}
class result {
	   String n1, n2, n3, n4, n5;
	   int a, b, c, d, e, SUM;
	   public void Book_Info(String q,String w,String e1,String r,String t, int A, int B, int C, int D, int E){
		   this.n1=q;
		   this.n2=w;
		   this.n3=e1;
		   this.n4=r;
		   this.n5=t;
		   this.a=A;
		   this.b=B;
		   this.c=C;
		   this.d=D;
		   this.e=E;
	   }
	   public void result_print() {
		   System.out.println("입력받은 책의 정보는 다음과 같습니다 : ");
		   System.out.println("제목: " + n1);
		   System.out.println("가격 : " + a + "원");
		   System.out.println("제목: " + n2);
		   System.out.println("가격 : " + b + "원");
		   System.out.println("제목: " + n3);
		   System.out.println("가격 : " + c + "원");
		   System.out.println("제목: " + n4);
		   System.out.println("가격 : " + d + "원");
		   System.out.println("제목: " + n5);
		   System.out.println("가격 : " + e + "원");
		   SUM = a+b+c+d+e;
		   System.out.println("책 가격의 총합은 아래와 같습니다");
		   System.out.println(SUM + "원");
}
}

