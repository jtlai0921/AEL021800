public class Ch6_2_3 {
   // 摸よ猭: 璸衡把计羆㎝
   public static double sum(double... numbers) {
      double total = 0.0;
      int count = numbers.length;
      for (int i = 0; i < count; i++) { 
         total += numbers[i];
      }
      return total;
   }
   // 祘Α
   public static void main(String[] args) {
      // 跑计
      double total1, total2;
      // ㊣摸よ猭
      total1 = sum(20.0, 10.0, 5.0); 
      total2 = sum(20.0, 10.0, 5.0, 3.0);
      // 陪ボ把计㎝
      System.out.println("3把计羆㎝: " + total1);
      System.out.println("4把计羆㎝: " + total2);
   }
}