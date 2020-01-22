class Customer {   // Customer類別宣告
   // 成員資料
   private int id;         // 編號
   private char rank;      // 等級
   private Date birthday;  // 生日
   // 建構子: 使用參數設定初始值
   public Customer(int id, char r, int m, int d, int y) {
      this.id = id;  rank = r;
      birthday = new Date(m, d, y); // 建立Date物件
   }
   // 成員方法: 顯示客戶資料
   public void printCustomer() {
      // 顯示客戶資料
      System.out.println("[客戶資料]============");
      System.out.println("編號: " + id);
      System.out.println("等級: " + rank);
      System.out.print("生日: ");
      birthday.printDate();
   }
}
class Date {   // Date類別宣告
   // 成員資料
   private int day;
   private int month;
   private int year;
   // 建構子: 使用參數設定成員資料初始值
   public Date(int month, int day, int year) {
      this.day = day; this.month = month;
      this.year = year;
   }
   // 成員方法: 顯示日期資料
   public void printDate() {
      // 輸出成員資料的月, 日和年
      System.out.println(month+"-"+day+"-"+year);
   }
}
// 主程式類別
public class Ch7_5 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Customer類別型態的變數且建立物件
      Customer c1 = new Customer(1, 'L', 1, 15, 1967);
      Customer c2 = new Customer(2, 'H', 5, 25, 1978);
      c1.printCustomer(); // 呼叫物件的實例方法
      c2.printCustomer();
   }
}