public class Ch4_3_5 {
   // �D�{��
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("�п�J�p��=> ");
      int hour = sc.nextInt(); // ���o�p��
      // ����ԭz�B��l
      System.out.println("24�p�ɨ�ɶ�: " + hour);
      hour = (hour >= 12) ? hour-12 : hour;
      System.out.println("12�p�ɨ�ɶ�: " + hour);
   }
}