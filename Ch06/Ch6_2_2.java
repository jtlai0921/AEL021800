public class Ch6_2_2 {
   // 主程式
   public static void main(String[] args) {
      // 變數宣告
      int i, j, total, sum;
      // 建立二維陣列
      int[][] grades = { { 54, 68 },
                         { 67, 78 },
                         { 89, 93 }
                      };
      // 使用巢狀迴圈計算總和
      total = 0;
      for ( j = 0; j < grades.length; j++ ) {
         sum = 0;
         for ( i = 0; i < grades[j].length; i++ ) {
            System.out.print(grades[j][i] + " ");
            sum += grades[j][i];
            total += grades[j][i];
         }
         System.out.println("==>小計: " + sum);
      }
      System.out.println("成績總和: " + total);
      // 建立二維物件陣列
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
      System.out.println("業績報表:");
      System.out.println("季\t去年\t今年");
      // 使用巢狀迴圈顯示陣列值
      for ( j = 0; j < sales.length; j++ ) {
         System.out.print("第"+(j+1)+"季\t");
         for ( i = 0; i < sales[i].length; i++ )
            System.out.print(sales[j][i] + "\t");
         System.out.println();
      }
   }
}