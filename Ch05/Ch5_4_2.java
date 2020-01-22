public class Ch5_4_2 {
   // 遞迴方法: 計算階層函數的值
   static int factorial(int n) {
      if ( n == 1 )  // 終止條件
         return 1;
      else
         return n * factorial(n-1);
   }
   // 主程式
   public static void main(String[] args) {
      java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);      
      System.out.print("請輸入最大階層=> ");
      int no = sc.nextInt(); // 取得最大階層
      System.out.println(no+"!函數的值:"+factorial(no));
   }
}