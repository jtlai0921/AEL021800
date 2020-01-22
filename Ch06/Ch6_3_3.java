public class Ch6_3_3 {
   // 主程式
   public static void main(String[] args) {
      // 使用建構子建立字串物件
      StringBuffer sb = new StringBuffer("程式");
      char[] charArr = { 'J','a','v','a' };
      System.out.println("原始字串內容: " + sb);
      // 新增字串內容
      sb.append('-');   // 字元
      System.out.println("新增字元\'-\': " + sb);
      sb.append(charArr, 0, 4);  // 字元陣列
      System.out.println("新增字元陣列: " + sb);
      sb.append("程式最佳教材");
      System.out.println("新增字串: " + sb);
      // 刪除字串內容
      sb.deleteCharAt(2);
      System.out.println("刪除第3個字: " + sb);
      sb.delete(0, 2);
      System.out.println("刪除前2個字: " + sb);
      // 插入字串內容
      sb.insert(6, "設計");
      System.out.println("插入中文字串: " + sb);
      sb.insert(4, " SE");
      System.out.println("插入英文字串: " + sb);
      // 取代字串內容
      sb.setCharAt(5, 'E');
      System.out.println("取代字元: " + sb);
      sb.replace(0, 7, "JDK SE");
      System.out.println("取代字串 : " + sb);
      sb.reverse();       // 反轉字串
      System.out.println("反轉後字串 : " + sb);
   }
}