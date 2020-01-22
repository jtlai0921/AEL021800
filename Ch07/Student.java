public class Student {
   // 成員變數
   public String name;   // 姓名
   public String address;// 地址
   public int age;       // 年齡   
   // 成員方法: 顯示學生名牌資料
   public void printNameCard() {
      System.out.println("姓名: " + name);
      System.out.println("地址: " + address);
      System.out.println("年齡: " + age);
      System.out.println("-------------------");
   }
}