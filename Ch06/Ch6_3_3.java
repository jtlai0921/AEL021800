public class Ch6_3_3 {
   // �D�{��
   public static void main(String[] args) {
      // �ϥΫغc�l�إߦr�ꪫ��
      StringBuffer sb = new StringBuffer("�{��");
      char[] charArr = { 'J','a','v','a' };
      System.out.println("��l�r�ꤺ�e: " + sb);
      // �s�W�r�ꤺ�e
      sb.append('-');   // �r��
      System.out.println("�s�W�r��\'-\': " + sb);
      sb.append(charArr, 0, 4);  // �r���}�C
      System.out.println("�s�W�r���}�C: " + sb);
      sb.append("�{���̨αЧ�");
      System.out.println("�s�W�r��: " + sb);
      // �R���r�ꤺ�e
      sb.deleteCharAt(2);
      System.out.println("�R����3�Ӧr: " + sb);
      sb.delete(0, 2);
      System.out.println("�R���e2�Ӧr: " + sb);
      // ���J�r�ꤺ�e
      sb.insert(6, "�]�p");
      System.out.println("���J����r��: " + sb);
      sb.insert(4, " SE");
      System.out.println("���J�^��r��: " + sb);
      // ���N�r�ꤺ�e
      sb.setCharAt(5, 'E');
      System.out.println("���N�r��: " + sb);
      sb.replace(0, 7, "JDK SE");
      System.out.println("���N�r�� : " + sb);
      sb.reverse();       // ����r��
      System.out.println("�����r�� : " + sb);
   }
}