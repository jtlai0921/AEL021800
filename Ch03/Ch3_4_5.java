public class Ch3_4_5 {
   // �D�{��
   public static void main(String[] args) {
      int a = 7;  int b = 5;  // �ܼƫŧi
      boolean blnA = a > b;
      boolean blnB = a == b;
      // �������Y�B��l
      System.out.println("�p��:7<5�� " + (a < b));
      System.out.println("�j��:7>5�� " + (a > b));
      System.out.println("�p�󵥩�:7<=5�� " + (a <= b));
      System.out.println("�j�󵥩�:7>=5�� " + (a >= b));
      System.out.println("����:7==5�� " + (a == b));
      System.out.println("������:7!=5�� " + (a != b));
      // ���ձ���B��l
      System.out.println("A����B�⦡: " + blnA);
      System.out.println("B����B�⦡: " + blnB);
      System.out.println("NOT����B��: !A �� " +(!blnA));
      System.out.println("AND����B��: A && B �� " +
                                    (blnA && blnB));
      System.out.println("OR����B��: A || B �� " +
                                    (blnA || blnB));
      System.out.println("XOR����B��: A ^ B �� " +
                                    (blnA ^ blnB));
   }
}