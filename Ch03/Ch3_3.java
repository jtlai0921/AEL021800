public class Ch3_3 {
   // �D�{��
   public static void main(String[] args) {
      // ����ܼƫŧi
      int i = 44;    int j = 0256;
      int k = 0xef;  int l = 0x3e6;
      System.out.print("44 = "); // ��ܵ��G
      System.out.println(i);
      System.out.print("0256 = ");
      System.out.println(j);
      System.out.print("0xef = ");
      System.out.println(k);
      System.out.print("0x3e6 = ");
      System.out.println(l);
      // �B�I���ܼƫŧi
      float m = 25.0F;    double n = 0.0123;
      double o = .00567;  double p = 1.25e4;
      System.out.println(m);   // ��ܵ��G
      System.out.println(n);
      System.out.println(o);
      System.out.println(p);
      char a = 'A';    // �r���ܼƫŧi
      char b = 65;     char c = '\u0020';
      System.out.println(a);   // ��ܵ��G
      System.out.println(b);
      System.out.println(c);
      System.out.print("����Ÿ�\n");
      System.out.println("\"Escape\"�h�X�r��");
      // Java SE 7�������u�r��
      long credit_card_number = 1234_5678_9012_3456L;
      float pi = 3.14_15F;
      long hexBytes = 0x00_EC_FF_5E;
      long bytes = 0b11010010_01101001;
      System.out.println("�H�Υd�d��: " + credit_card_number);
      System.out.println("PI: " + pi);
      System.out.println("�Q���i��: " + hexBytes);
      System.out.println("�줸��: " + bytes);
   }
}