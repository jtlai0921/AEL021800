public class Ch6_2_1 {
   // 主程式
   public static void main(String[] args) {
      int i, sum = 0;  // 變數宣告
      double average, total = 0.0;
      // 建立int陣列
      int[] temp;  // 宣告陣列變數
      int[] tips = {150, 200, 300};
      // 建立double陣列
      double[] sales = new double[4];
      sales[0] = 145.6;  // 第一季
      sales[1] = 178.9;  // 第二季
      sales[2] = 197.3;  // 第三季
      sales[3] = 156.7;  // 第四季
      temp = tips;  // 指向同一個陣列
      // 使用for迴圈顯示陣列值和計算總和
      for ( i=0; i < tips.length; i++ ) {
         sum += temp[i];
         System.out.print("[" + temp[i] + "]");
      }
      System.out.println("\n小費總計: " + sum);
      // 使用foreach迴圈顯示陣列值和計算平均
      for (double ele : sales) {
         total += ele;
         System.out.print("[" + ele + "]");
      }
      System.out.println("\n業績總和: " + total);
      average = total/(double)sales.length;
      System.out.println("平均業績: " + average);
   }
}