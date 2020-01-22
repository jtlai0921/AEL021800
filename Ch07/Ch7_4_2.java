class Counter { // Counter摸
   private int count;
   // 篶
   public Counter(int count) {
       this.count = count;
   }
   // 筁更よ猭: ぃ篈
   public Counter count(double num) {
      count += num;
      return this;
   }
   public Counter count(int num) {
      count += num;
      return this;
   }
   // 眔璸计
   public int getCount() { return count; }
}
public class Ch7_4_2 {
   // 祘Α
   public static void main(String[] args) {
      Counter c = new Counter(10); // ミン
      // ﹃瑈㊣よ猭
      int count = c.count(2).count(3.0).getCount();
      // 陪ボ璸计
      System.out.println("ヘ玡璸计: " + count);
   }
}