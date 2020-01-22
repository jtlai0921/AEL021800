import java.util.*;
public class Ch10_5_4 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件HashSet宣告
      HashSet<String> hset = new HashSet<String>();
      hset.add("陳會安");
      hset.add("江小魚");
      hset.add("陳允傑");
      System.out.println("HashSet內容: " + hset);
      // 使用Iterator介面顯示HashSet元素
      Iterator<String> iterator = hset.iterator();
      System.out.print("HashSet集合(iterator):");
      while (iterator.hasNext())
         System.out.print(" "+iterator.next());
      System.out.println();      
   }
}