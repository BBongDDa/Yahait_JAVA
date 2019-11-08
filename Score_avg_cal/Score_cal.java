import java.util.Scanner;

public class Input_Score {

   public static void main(String[] args) {
      Scanner Input = new Scanner(System.in);
      AVG S = new AVG();
      int kor, math, eng, sc;
      System.out.print("국어 : ");
      kor = Input.nextInt();
      System.out.print("수학 : ");
      math = Input.nextInt();
      System.out.print("영어 : ");
      eng = Input.nextInt();
      System.out.print("과탐 과목 2개 점수의 합 : ");
      sc = Input.nextInt();
      S.setScore(kor, math, eng, sc);
      Input.close();
      S.RealAVG();

   }
   

}
class AVG{
   int kor, math, eng, sc;
   public void setScore(int k, int m, int e, int s){
      this.kor=k;
      this.math=m;
      this.eng=e;
      this.sc=s;
   }
   public void RealAVG() {
      System.out.println((kor+math+eng+sc)/4.0);
   }
}