public class Ch3_5_1 {
   // �D�{��
   public static void main(String[] args) {
      // �ܼƫŧi
      int a = 123;
      float b = 15.5F;
      long c = 345678L;
      int r;      long r1;
      float r2;   double r3;
      // �e�򥻫��A�ഫ
      System.out.print("a(i)=" + a + " b(f)=" + b);
      System.out.println(" c(l)=" + c);
      r = a + 134;
      System.out.println("r(i)=a(i)+134(i)=" + r);
      r1 = a + c;
      System.out.println("r1(l)=a(i)+c(l)=" + r1);
      r2 = a * b;
      System.out.println("r2(f)=a(i)*b(f)=" + r2);
      r3 = c * b;
      System.out.println("r3(d)=c(l)*b(f)=" + r3);
   }
}