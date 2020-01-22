public class Ch6_6_2 {
   // 類別方法: 泡沫排序法
   private static void bubble(int[] data) {
      int i, j, temp;  // 變數宣告
      // 第一層迴圈
      for ( j = data.length; j > 1; j-- )
         // 第二層迴圈
         for ( i = 0; i < j - 1; i++ )
            // 比較相鄰的陣列元素
            if ( data[i+1] < data[i] ) {
               temp = data[i+1];  // 交換兩元素
               data[i+1] = data[i];
               data[i] = temp;
            }
   }
   // 主程式
   public static void main(String[] args) {
      // 宣告變數
      int[] data = {89, 34, 78, 45};
      int i;
      System.out.print("原始陣列: ");
      for ( i = 0; i < data.length; i++ )
         System.out.print("[" + data[i] + "]");
      System.out.print("\n");
      // 呼叫排序方法
      bubble(data);
      System.out.print("排序陣列: ");
      for ( i = 0; i < data.length; i++ )
         System.out.print("[" + data[i] + "]");
      System.out.print("\n");
   }
}