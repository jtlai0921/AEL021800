public class Ch6_2_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ܼƫŧi
      int i, j, total, sum;
      // �إߤG���}�C
      int[][] grades = { { 54, 68 },
                         { 67, 78 },
                         { 89, 93 }
                      };
      // �ϥα_���j��p���`�M
      total = 0;
      for ( j = 0; j < grades.length; j++ ) {
         sum = 0;
         for ( i = 0; i < grades[j].length; i++ ) {
            System.out.print(grades[j][i] + " ");
            sum += grades[j][i];
            total += grades[j][i];
         }
         System.out.println("==>�p�p: " + sum);
      }
      System.out.println("���Z�`�M: " + total);
      // �إߤG������}�C
      double[][] sales = new double[4][];
      for ( i = 0; i < sales.length; i++)
         sales[i] = new double[2];
      sales[0][0] = 123.4;
      sales[0][1] = 143.5;
      sales[1][0] = 142.3;
      sales[1][1] = 198.4;
      sales[2][0] = 234.6;
      sales[2][1] = 200.5;
      sales[3][0] = 167.1;
      sales[3][1] = 150.4;
      System.out.println("�~�Z����:");
      System.out.println("�u\t�h�~\t���~");
      // �ϥα_���j����ܰ}�C��
      for ( j = 0; j < sales.length; j++ ) {
         System.out.print("��"+(j+1)+"�u\t");
         for ( i = 0; i < sales[i].length; i++ )
            System.out.print(sales[j][i] + "\t");
         System.out.println();
      }
   }
}