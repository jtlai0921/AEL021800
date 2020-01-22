public class Ch10_1_4a {
   // 類別方法: 顯示例外訊息
   static void printErrMsg(Exception e) {
      System.out.println("例外說明: " + e.getMessage());
      System.out.print("例外原因: ");
      e.printStackTrace();
   }
   // 主程式
   public static void main(String[] args) {
      int i;
      int[] data = {22, 14, 36, 68, 87};
      // 例外處理程式敘述
      try {
         int index = (int)(Math.random()*10);
         i = data[index];  // 產生超過陣列範圍例外
         // 產生除以零的例外
         for ( i = 2; i > -1; i-- )
            System.out.println("計算結果: " +10/i);
      }
      catch ( ArithmeticException |
              ArrayIndexOutOfBoundsException e ) {
         printErrMsg(e);
      }
      finally {
         System.out.println("例外處理結束");
      }
   }
}