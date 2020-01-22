// 自訂Exception類別
class UserException extends Exception {
   private static final long serialVersionUID = 1L;
   // 變數宣告
   int data;
   // 建構子
   public UserException(int data) {
      this.data = data;
   }
   // 覆寫getMessaeg()方法
   public String getMessage() {
      return ("出價次數太多: " + data);
   }
}
// 主程式類別
public class Ch10_2_3 {
   // 主程式
   public static void main(String[] args) {
      try {
         int i;
         for ( i = 0; i < 10; i++ ) {
            if ( i == 5 ) {
               // 丟出自訂的例外
               throw new UserException(5);
            }
            System.out.println("出價次數: " + i);
         }
      }
      catch( UserException e ) {
         // 處理自訂的例外
         System.out.println("例外說明: "+e.getMessage());
         System.out.println("例外原因: ");
         e.printStackTrace();
      }
      finally {
         System.out.println("例外處理結束!");
      }
   }
}