class Date {   // Date類別宣告
   private int day;
   private int month;
   private int year;
   // 成員方法(1): 設定日期資料
   public void setDate(int d, int m, int y) {
      day = d;          // 設定日期
      month = m;        // 設定月份
      year = y;         // 設定年份
   }
   // 成員方法(2): 設定日期資料
   public void setDate(int d, int m) {
      day = d;          // 設定日期
      month = m;        // 設定月份
      year = 1975;      // 設定年份
   }
   // 成員方法(3): 設定日期資料
   public void setDate(long d, long m, long y) {
      day = (int) d;     // 設定日期
      month = (int) m;   // 設定月份
      year = (int) y;    // 設定年份
   } 
   // 成員方法: 顯示日期資料
   public void printDate() {
      System.out.println(month+"/"+day+"/"+year);
   }
}
// 主程式類別
public class Ch7_3_4 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Date類別型態的變數, 並且建立物件
      Date myBirthday = new Date();
      Date oneBirthday = new Date();
      Date today = new Date();
      // 指定日期資料
      myBirthday.setDate(13, 9, 1970);
      oneBirthday.setDate(12, 6);
      today.setDate(5L, 12L, 2014L);
      System.out.print("我的生日: ");
      myBirthday.printDate();  // 呼叫物件的方法
      System.out.print("女友生日: ");
      oneBirthday.printDate();
      System.out.print("今日: ");
      today.printDate();
   }
}