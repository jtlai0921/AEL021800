public class Ch4_2 {
   // �D�{��
   public static void main(String[] args) {
      int a = 6, b = 12;  // �ܼƫŧi
      System.out.println("�洫�ܼ�:" + a + " : " + b);
      {  // �洫�ܼ�a�Mb
         int temp;  // �ŧi�϶��ܼ�
         temp = a; a = b; b = temp;
      }
      System.out.println("�洫��:" + a + " : " + b);
      // System.out.println(temp);
   }
}