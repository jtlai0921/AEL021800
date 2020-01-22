public class Ch6_6_4 {
   // 類別方法: 二元搜尋的遞迴方法
   static int binarySearch(int[] d,int l,int h,int v) {
      // 遞迴的終止條件
      if ( l > h) return -1;
      else {
         // 取得中間索引
         int m = (l + h) / 2;
         if ( v == d[m]) // 找到
            return m;    // 傳回索引值
         else if ( v < d[m]) // 前半部分
                 return binarySearch(d, l, m-1, v);
              else   // 後半部分
                 return binarySearch(d, m+1, h, v);
       }
   }
   // 主程式
   public static void main(String[] args) {
      java.util.Scanner sc = // 建立Scanner物件
            new java.util.Scanner(System.in);
      System.out.print("請輸入鍵值=> ");
      int t = sc.nextInt(); // 取得鍵值
      int[] data = {12, 13, 24, 35, 44, 67, 78, 98};      
      // 呼叫二元搜尋法
      int i = binarySearch(data,0,data.length-1,t);
      if ( i != -1 )
         System.out.println("搜尋到值: "+ t +"("+i+")");
      else
         System.out.println("沒有搜尋到值: "+ t);
   }
}