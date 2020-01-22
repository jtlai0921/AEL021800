abstract class Shape {   // Shape��H���O�ŧi
   public double x;   // X�y��
   public double y;   // y�y��
   // ��H��k: �p�⭱�n
   public abstract void area();
}
interface IPerimeter {   // IPerimeter�����ŧi
   // ������k: �p��P��
   void perimeter();
}
// Rectangle���O�ŧi
class Rectangle extends Shape implements IPerimeter {
   public double width;
   public double height;
   // �غc�l
   public Rectangle(double x,double y,double w,double h) {
      this.x = x;
      this.y = y;
      width = w;
      height = h;
   }
   // ������k: ��@��H��karea()
   public void area() {
      System.out.println("����έ��n:"+width*height);
   }
   // ������k: ��@������kperimeter()
   public void perimeter() {
      System.out.println("����ΩP��:"+2*(width+height));
   }
}
// �D�{�����O
public class Ch8_5 {
   // �D�{��
   public static void main(String[] args) {
      Shape s;        // ��H���O�������ܼ�
      Rectangle r;    // ���O�������ܼ�
      // �ŧiRectangle���O���A���ܼ�, �åB�إߪ���
      Rectangle r1 = new Rectangle(5.0, 15.0, 6.0, 5.0);
      Shape r2 = new Rectangle(10.0, 10.0, 8.0, 9.0);
      IPerimeter r3 = new Rectangle(15.0,15.0,4.0,8.0);
      // ��ܪ����r1�����
      System.out.println("�����r1����� =====");
      System.out.println("X,Y�y��:"+r1.x+","+r1.y);
      System.out.println("�e/��:"+r1.width+"/"+r1.height);
      r1.area();   // �I�s���󪺤�k
      r1.perimeter();
      // ��ܪ����r2�����, �ˬd�O�_��Rectangle����
      if ( r2 instanceof Rectangle )
         System.out.println("->r2�ORectangle����");
      System.out.println("�����r2����� =====");
      System.out.println("X,Y�y��:"+r2.x+","+r2.y);
      r = (Rectangle) r2;   // ���A�ഫ
      System.out.println("�e/��:"+r.width+"/"+r.height);
      r2.area();   // �I�s���󪺤�k
      r.perimeter();
      // ��ܪ����r3�����, �ˬd�O�_��Rectangle����
      if ( r3 instanceof Rectangle )
          System.out.println("->r3�ORectangle����");
      System.out.println("�����r3����� =====");
      s = (Rectangle) r3;  // ���A�ഫ
      System.out.println("X,Y�y��:"+s.x+","+s.y);
      r = (Rectangle) r3;  // ���A�ഫ
      System.out.println("�e/��:"+r.width+"/"+r.height);
      s.area();   // �I�s���󪺤�k
      r3.perimeter();
   }
}