public class Ch3_4_4 {
   // 主程式
   public static void main(String[] args) {
      int inc = 10;  // 變數宣告
      int dec = 10;
      inc++;   // 遞增
      System.out.println("遞增運算: A++ = " + inc);
      dec--;   // 遞減
      System.out.println("遞減運算: A-- = " + dec);
      // 遞增和遞減運算字
      int x = 10, y = 10;
      System.out.println("x++ = " + x++ +":x = " + x );
      System.out.println("--y = " + --y +":y = " + y);
   }
}