public class Ch4_4_4 {
   // 主程式
   public static void main(String[] args) {
      int i = 1, total = 0; // 變數宣告
      // do/while迴圈敘述
      do {
         System.out.print("|" + i);
         total += i;
         i++;
         if ( i > 15 ) break;   // 跳出迴圈
      } while ( true );
      System.out.println("\n總和: " + total);
      // for迴圈敘述
      for ( total = 0, i = 1; i <= 10; i++ ) {
         if ( (i % 2) == 1 ) continue; // 繼續迴圈
         System.out.print("|" + i);
         total += i;
      }
      System.out.println("\n偶數的總和: " + total);
    }
}