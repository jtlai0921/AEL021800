interface IArea {  // IArea�����ŧi
   // ������k: �p�⭱�n
   void area();
}
class Circle implements IArea { // Circle���O�ŧi
   private double r;     // �b�|
   // �غc�l
   public Circle(double r) {
      this.r = r;
   }
   // ������k: ��@������karea()
   public void area() {
      System.out.println("��έ��n: " + 3.1416*r*r);
   }
}
class Rectangle implements IArea {  // Rectangle���O�ŧi
   private double width;     // �e
   private double height;    // ��
   // �غc�l
   public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }
   // ������k: ��@������karea()
   public void area() {
      System.out.println("����έ��n: "+(width*height));
   }
}
class Triangle implements IArea {   // Triangle���O�ŧi
   private double height;    // ��
   private double bottom;    // �T���Ω���
   // �غc�l
   public Triangle(double height, double bottom) {
      this.height = height;
      this.bottom = bottom;
   }
   // ������k: ��@������karea()
   public void area() {
      System.out.println("�T���έ��n: "+height*bottom/2.0);
   }
}
// �D�{�����O
public class Ch9_4_2 {
   // �D�{��
   public static void main(String[] args) {
      IArea a;    // �����������ܼ�
      // �ŧi���O���A���ܼ�, �åB�إߪ���
      Circle c = new Circle(6.0);
      Rectangle r=new Rectangle(10.0, 15.0);
      Triangle t=new Triangle(20.0, 15.0);
      // �I�s������������karea()
      for ( int i = 1; i <= 3; i++ ) {
         if ( i == 1 )        a = c;  // ���
           else if ( i == 2 ) a = r;  // �����
                else          a = t;  // �T����
         a.area();
      }
   }
}