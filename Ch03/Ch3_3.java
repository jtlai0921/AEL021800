public class Ch3_3 {
   // 主程式
   public static void main(String[] args) {
      // 整數變數宣告
      int i = 44;    int j = 0256;
      int k = 0xef;  int l = 0x3e6;
      System.out.print("44 = "); // 顯示結果
      System.out.println(i);
      System.out.print("0256 = ");
      System.out.println(j);
      System.out.print("0xef = ");
      System.out.println(k);
      System.out.print("0x3e6 = ");
      System.out.println(l);
      // 浮點數變數宣告
      float m = 25.0F;    double n = 0.0123;
      double o = .00567;  double p = 1.25e4;
      System.out.println(m);   // 顯示結果
      System.out.println(n);
      System.out.println(o);
      System.out.println(p);
      char a = 'A';    // 字元變數宣告
      char b = 65;     char c = '\u0020';
      System.out.println(a);   // 顯示結果
      System.out.println(b);
      System.out.println(c);
      System.out.print("換行符號\n");
      System.out.println("\"Escape\"逸出字元");
      // Java SE 7版的底線字元
      long credit_card_number = 1234_5678_9012_3456L;
      float pi = 3.14_15F;
      long hexBytes = 0x00_EC_FF_5E;
      long bytes = 0b11010010_01101001;
      System.out.println("信用卡卡號: " + credit_card_number);
      System.out.println("PI: " + pi);
      System.out.println("十六進位: " + hexBytes);
      System.out.println("位元值: " + bytes);
   }
}