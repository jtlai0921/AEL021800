public class Ch5_2_3 {
   static double convertTemp(double c) {
      return (9.0 * c) / 5.0 + 32.0;
   }
   // ���O��k: �p��N��N���Ʀr�`�M
   static int sumN2N(int start, int end) {
      int i, sum = 0;  // �ܼƫŧi
      // for�j��ԭz
      for ( i = start; i <= end; i++ )
         sum += i;
      return sum;
   }
   // �D�{��
   public static void main(String[] args) {
      java.util.Scanner sc = // �إ�Scanner����
                new java.util.Scanner(System.in);
      System.out.print("�п�J���ū�=> ");
      double c = sc.nextDouble(); // ���o�ū�
      System.out.print("�п�J�}�l��=> ");
      int s = sc.nextInt(); // ���o�}�l��
      System.out.print("�п�J������=> ");
      int e = sc.nextInt(); // ���o������
      // ���O��k���I�s
      int total = sumN2N(s, e); 
      System.out.println(s+"�[��"+e+"���`�M:"+total);
      double f = convertTemp(c);
      System.out.println(c + "��C=" + f + "��F");
   }
}