
import java.util.Scanner;

public class Bookstore {

   public static void main(String[] args) {
      Scanner Input_Bookname = new Scanner(System.in);
      Scanner Input_Bookprice = new Scanner(System.in);
      int A, B, C, D, E;
      result S = new result();
      String name1, name2, name3, name4, name5;
      System.out.println("å�� ������ �Է����ּ��� (1/5) : ");
      name1 = Input_Bookname.nextLine();
      System.out.println("������ �Է����ּ��� (��): ");
      A = Input_Bookprice.nextInt();
      System.out.println("å�� ������ �Է����ּ��� (2/5) : ");
      name2 = Input_Bookname.nextLine();
      System.out.println("������ �Է����ּ��� (��): ");
      B = Input_Bookprice.nextInt();
      System.out.println("å�� ������ �Է����ּ��� (3/5) : ");
      name3 = Input_Bookname.nextLine();
      System.out.println("������ �Է����ּ��� (��): ");
      C = Input_Bookprice.nextInt();
      System.out.println("å�� ������ �Է����ּ��� (4/5) : ");
      name4 = Input_Bookname.nextLine();
      System.out.println("������ �Է����ּ��� (��): ");
      D = Input_Bookprice.nextInt();
      System.out.println("å�� ������ �Է����ּ��� (5/5) : ");
      name5 = Input_Bookname.nextLine();
      System.out.println("������ �Է����ּ��� (��): ");
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
		   System.out.println("�Է¹��� å�� ������ ������ �����ϴ� : ");
		   System.out.println("����: " + n1);
		   System.out.println("���� : " + a + "��");
		   System.out.println("����: " + n2);
		   System.out.println("���� : " + b + "��");
		   System.out.println("����: " + n3);
		   System.out.println("���� : " + c + "��");
		   System.out.println("����: " + n4);
		   System.out.println("���� : " + d + "��");
		   System.out.println("����: " + n5);
		   System.out.println("���� : " + e + "��");
		   SUM = a+b+c+d+e;
		   System.out.println("å ������ ������ �Ʒ��� �����ϴ�");
		   System.out.println(SUM + "��");
}
}

