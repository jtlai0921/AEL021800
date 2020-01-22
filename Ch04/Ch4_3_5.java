public class Ch4_3_5 {
   // 主程式
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("請輸入小時=> ");
      int hour = sc.nextInt(); // 取得小時
      // 條件敘述運算子
      System.out.println("24小時制的時間: " + hour);
      hour = (hour >= 12) ? hour-12 : hour;
      System.out.println("12小時制的時間: " + hour);
   }
}