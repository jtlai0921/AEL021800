public class Ch6_4_2 {
   // 主程式
   public static void main(String[] args) {
      // 變數宣告
      byte num1 = 5;
      short num2 = 20;
      int num3 = 200;
      long num4 = 12000;
      float num5 = 234.56f;
      double num6 = 124.566789;
      // 使用類別方法toString()轉換成字串
      String str1 = Byte.toString(num1);
      String str2 = Short.toString(num2);
      String str3 = Integer.toString(num3);
      String str4 = Long.toString(num4);
      String str5 = Float.toString(num5);
      String str6 = Double.toString(num6);
      // 顯示轉換的結果
      System.out.println("Byte.toString(): "+str1);
      System.out.println("Short.toString(): "+str2);
      System.out.println("Integer.toString(): "+str3);
      System.out.println("Long.toString(): "+str4);
      System.out.println("Float.toString(): "+str5);
      System.out.println("Double.toString(): "+str6);
   }
}