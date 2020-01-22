public class Ch4_3_4a {
   // 主程式
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("請輸入GPA成績 =>");
      String gpa = sc.nextLine();
      switch ( gpa ) {
          case "A":
             System.out.println("學生成績超過:80");
             break;
          case "B":
             System.out.println("學生成績:70~79");
             break;
          case "C":
             System.out.println("學生成績:60~69");
             break;
          default:
             System.out.println("學生成績不及格!");
      }
   }
}