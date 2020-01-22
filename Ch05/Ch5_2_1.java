public class Ch5_2_1 {
   // 類別方法: 顯示星號三角形
   private static void printTriangle() {
      int i, j;  // 變數宣告
      // for巢狀迴圈
      for ( i = 5; i >= 1; i-- ) {
         for ( j = 1; j <= i; j++ )
            System.out.print("*");
         System.out.print("\n");
      }
   }
   // 類別方法: 計算1加到5的總和
   public static void sumOne2Five() {
      int i, sum = 0;;  // 變數宣告
      // for迴圈敘述
      for ( i = 1; i <= 5; i++ ) {
         System.out.print("|" + i);
         sum += i;
      }
      System.out.println("\n總和: " + sum);
   }
   // 主程式
   public static void main(String[] args) {
      // 類別方法的呼叫
      printTriangle();
      // 另一種類別方法的呼叫
      Ch5_2_1.sumOne2Five();
   }
}