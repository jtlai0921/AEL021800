public class Ch3_4_6 {
   // �D�{��
   public static void main(String[] args) {
      // �ܼƫŧi
      int a = 0x3c;   // 00111100
      int b = 0x0f;   // 00001111
      int c = 0x03;   // 00000011
      int d = 0x78;   // 01111000
      int f = 0x03;   // 00000011
      int g = 120;    // 01111000
      int r;
      System.out.println("a/b���� = " + a + "/" + b);
      System.out.println("c/d���� = " + c + "/" + d);
      r = ~a;       // NOT�B��
      System.out.println("NOT�B��: ~a = " + r);
      r = a & b;    // AND�B��
      System.out.println("AND�B��: a & b = " + r);
      r = a | c;    // OR�B��
      System.out.println("OR�B��:  a | c = " + r);
      r = a ^ d;    // XOR�B��
      System.out.println("XOR�B��: a ^ d = " + r);
      // �����P�k���줸�B��l
      System.out.println("f/g����=" + f + "/" + g);
      System.out.println("�����B��: f<<1 = " +(f<<1));
      System.out.println("�����B��: f<<2 = " +(f<<2));
      System.out.println("�k���B��: g>>1 = " +(g>>1));
      System.out.println("�k���B��: g>>2 = " +(g>>2));
   }
}