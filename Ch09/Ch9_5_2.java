import ch9_5_2.myShape.Shape;
import ch9_5_2.myShape.Circle;
import ch9_5_2.myShape.Rectangle;
import ch9_5_2.myShape.Triangle;
// import ch9_5_2.myShape.*;
public class Ch9_5_2 {
   // �D�{��
   public static void main(String[] args) {
      Shape s;    // ��H���O�������ܼ�
      // �ŧi���O���A���ܼ�, �åB�إߪ���
      Circle c = new Circle(5.0, 10.0, 4.0);
      Rectangle r = new Rectangle(10.0,10.0,20.0,20.0);
      Triangle t = new Triangle(10.0,10.0,25.0,5.0);
      // �I�s��H�������󪺩�H��karea()
      s = c;     // ���
      s.area();
      s = r;     // �����
      s.area();
      s = t;     // �T����
      s.area();
   }
}