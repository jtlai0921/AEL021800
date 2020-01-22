class MyNumber { // MyNumber類別宣告
   public String result;
   // 建構子
   public MyNumber() {
      MyInt myInt = new MyInt(100) {
         // 覆寫方法 
         public String getResult() {
            return "整數值： " + value;
         }
      };
      result = myInt.getResult();
   }
   class MyInt {   // MyInt類別宣告
      public int value;
      public MyInt(int v) { value = v; }
      public String getResult(){return "Int:"+value;}
   }
}
//主程式類別
public class Ch9_2_1 {
   // 主程式
   public static void main(String[] args) {
      String str = "";
      // 建立MyNumber物件
      MyNumber myNum = new MyNumber();
      // 取得成員變數result
      str = myNum.result;
      // 顯示成員變數值
      System.out.println(str);
   }
}