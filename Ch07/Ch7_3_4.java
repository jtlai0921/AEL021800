class Date {   // Date���O�ŧi
   private int day;
   private int month;
   private int year;
   // ������k(1): �]�w������
   public void setDate(int d, int m, int y) {
      day = d;          // �]�w���
      month = m;        // �]�w���
      year = y;         // �]�w�~��
   }
   // ������k(2): �]�w������
   public void setDate(int d, int m) {
      day = d;          // �]�w���
      month = m;        // �]�w���
      year = 1975;      // �]�w�~��
   }
   // ������k(3): �]�w������
   public void setDate(long d, long m, long y) {
      day = (int) d;     // �]�w���
      month = (int) m;   // �]�w���
      year = (int) y;    // �]�w�~��
   } 
   // ������k: ��ܤ�����
   public void printDate() {
      System.out.println(month+"/"+day+"/"+year);
   }
}
// �D�{�����O
public class Ch7_3_4 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiDate���O���A���ܼ�, �åB�إߪ���
      Date myBirthday = new Date();
      Date oneBirthday = new Date();
      Date today = new Date();
      // ���w������
      myBirthday.setDate(13, 9, 1970);
      oneBirthday.setDate(12, 6);
      today.setDate(5L, 12L, 2014L);
      System.out.print("�ڪ��ͤ�: ");
      myBirthday.printDate();  // �I�s���󪺤�k
      System.out.print("�k�ͥͤ�: ");
      oneBirthday.printDate();
      System.out.print("����: ");
      today.printDate();
   }
}