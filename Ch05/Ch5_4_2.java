public class Ch5_4_2 {
   // ���j��k: �p�ⶥ�h��ƪ���
   static int factorial(int n) {
      if ( n == 1 )  // �פ����
         return 1;
      else
         return n * factorial(n-1);
   }
   // �D�{��
   public static void main(String[] args) {
      java.util.Scanner sc = // �إ�Scanner����
                new java.util.Scanner(System.in);      
      System.out.print("�п�J�̤j���h=> ");
      int no = sc.nextInt(); // ���o�̤j���h
      System.out.println(no+"!��ƪ���:"+factorial(no));
   }
}