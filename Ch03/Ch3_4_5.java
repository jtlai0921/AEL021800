public class Ch3_4_5 {
   // 主程式
   public static void main(String[] args) {
      int a = 7;  int b = 5;  // 變數宣告
      boolean blnA = a > b;
      boolean blnB = a == b;
      // 測試關係運算子
      System.out.println("小於:7<5為 " + (a < b));
      System.out.println("大於:7>5為 " + (a > b));
      System.out.println("小於等於:7<=5為 " + (a <= b));
      System.out.println("大於等於:7>=5為 " + (a >= b));
      System.out.println("等於:7==5為 " + (a == b));
      System.out.println("不等於:7!=5為 " + (a != b));
      // 測試條件運算子
      System.out.println("A條件運算式: " + blnA);
      System.out.println("B條件運算式: " + blnB);
      System.out.println("NOT條件運算: !A 為 " +(!blnA));
      System.out.println("AND條件運算: A && B 為 " +
                                    (blnA && blnB));
      System.out.println("OR條件運算: A || B 為 " +
                                    (blnA || blnB));
      System.out.println("XOR條件運算: A ^ B 為 " +
                                    (blnA ^ blnB));
   }
}