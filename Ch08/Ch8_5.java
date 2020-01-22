abstract class Shape {   // Shape抽象類別宣告
   public double x;   // X座標
   public double y;   // y座標
   // 抽象方法: 計算面積
   public abstract void area();
}
interface IPerimeter {   // IPerimeter介面宣告
   // 介面方法: 計算周長
   void perimeter();
}
// Rectangle類別宣告
class Rectangle extends Shape implements IPerimeter {
   public double width;
   public double height;
   // 建構子
   public Rectangle(double x,double y,double w,double h) {
      this.x = x;
      this.y = y;
      width = w;
      height = h;
   }
   // 成員方法: 實作抽象方法area()
   public void area() {
      System.out.println("長方形面積:"+width*height);
   }
   // 成員方法: 實作介面方法perimeter()
   public void perimeter() {
      System.out.println("長方形周長:"+2*(width+height));
   }
}
// 主程式類別
public class Ch8_5 {
   // 主程式
   public static void main(String[] args) {
      Shape s;        // 抽象類別的物件變數
      Rectangle r;    // 類別的物件變數
      // 宣告Rectangle類別型態的變數, 並且建立物件
      Rectangle r1 = new Rectangle(5.0, 15.0, 6.0, 5.0);
      Shape r2 = new Rectangle(10.0, 10.0, 8.0, 9.0);
      IPerimeter r3 = new Rectangle(15.0,15.0,4.0,8.0);
      // 顯示長方形r1的資料
      System.out.println("長方形r1的資料 =====");
      System.out.println("X,Y座標:"+r1.x+","+r1.y);
      System.out.println("寬/高:"+r1.width+"/"+r1.height);
      r1.area();   // 呼叫物件的方法
      r1.perimeter();
      // 顯示長方形r2的資料, 檢查是否為Rectangle物件
      if ( r2 instanceof Rectangle )
         System.out.println("->r2是Rectangle物件");
      System.out.println("長方形r2的資料 =====");
      System.out.println("X,Y座標:"+r2.x+","+r2.y);
      r = (Rectangle) r2;   // 型態轉換
      System.out.println("寬/高:"+r.width+"/"+r.height);
      r2.area();   // 呼叫物件的方法
      r.perimeter();
      // 顯示長方形r3的資料, 檢查是否為Rectangle物件
      if ( r3 instanceof Rectangle )
          System.out.println("->r3是Rectangle物件");
      System.out.println("長方形r3的資料 =====");
      s = (Rectangle) r3;  // 型態轉換
      System.out.println("X,Y座標:"+s.x+","+s.y);
      r = (Rectangle) r3;  // 型態轉換
      System.out.println("寬/高:"+r.width+"/"+r.height);
      s.area();   // 呼叫物件的方法
      r3.perimeter();
   }
}