public class Ch5_2_1 {
   // ���O��k: ��ܬP���T����
   private static void printTriangle() {
      int i, j;  // �ܼƫŧi
      // for�_���j��
      for ( i = 5; i >= 1; i-- ) {
         for ( j = 1; j <= i; j++ )
            System.out.print("*");
         System.out.print("\n");
      }
   }
   // ���O��k: �p��1�[��5���`�M
   public static void sumOne2Five() {
      int i, sum = 0;;  // �ܼƫŧi
      // for�j��ԭz
      for ( i = 1; i <= 5; i++ ) {
         System.out.print("|" + i);
         sum += i;
      }
      System.out.println("\n�`�M: " + sum);
   }
   // �D�{��
   public static void main(String[] args) {
      // ���O��k���I�s
      printTriangle();
      // �t�@�����O��k���I�s
      Ch5_2_1.sumOne2Five();
   }
}