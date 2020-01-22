import ch9_5_2.myShape.Shape;
import ch9_5_2.myShape.Circle;
import ch9_5_2.myShape.Rectangle;
import ch9_5_2.myShape.Triangle;
// import ch9_5_2.myShape.*;
public class Ch9_5_2 {
   // 主程式
   public static void main(String[] args) {
      Shape s;    // 抽象類別的物件變數
      // 宣告類別型態的變數, 並且建立物件
      Circle c = new Circle(5.0, 10.0, 4.0);
      Rectangle r = new Rectangle(10.0,10.0,20.0,20.0);
      Triangle t = new Triangle(10.0,10.0,25.0,5.0);
      // 呼叫抽象類型物件的抽象方法area()
      s = c;     // 圓形
      s.area();
      s = r;     // 長方形
      s.area();
      s = t;     // 三角形
      s.area();
   }
}