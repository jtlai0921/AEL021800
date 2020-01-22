public class Ch4_2 {
   // 祘Α
   public static void main(String[] args) {
      int a = 6, b = 12;  // 跑计
      System.out.println("ユ传跑计:" + a + " : " + b);
      {  // ユ传跑计a㎝b
         int temp;  // 跋遏跑计
         temp = a; a = b; b = temp;
      }
      System.out.println("ユ传:" + a + " : " + b);
      // System.out.println(temp);
   }
}