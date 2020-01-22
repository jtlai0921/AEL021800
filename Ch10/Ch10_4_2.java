// 執行緒類別
class SumThread extends Thread {
   private long length;
   // 建構子
   public SumThread(long length, String name) {
       super(name);
       this.length = length;
   }
   // 執行執行緒
   public void run() {
      long temp = 0;
      for (int i = 1; i <= length; i++) {
         try {  // 暫停一段時間
            Thread.sleep((int)(Math.random()*10));
         }
         catch(InterruptedException e) { }
         temp += i;
      }
      System.out.println(Thread.currentThread() +
                         "總和 = " + temp);
   }
}
// 主類別
public class Ch10_4_2 {
   // 主程式
   public static void main(String[] args) {
      System.out.print("執行緒: ");
      System.out.println(Thread.currentThread());
      // 建立執行緒物件
      SumThread st1 = new SumThread(150, "執行緒A");
      // 啟動執行緒
      st1.start();
      // 建立匿名內層類別來啟動執行緒
      new Thread("執行緒B") {
         int length = 150;
         // 執行執行緒 
         public void run() {
            long temp = 0;
            for (int i = 1; i <= length; i++) {
               try {  // 暫停一段時間
                  Thread.sleep((int)(Math.random()*10));
               }
               catch(InterruptedException e) { } 
                  temp += i;
               } 
               System.out.println(Thread.currentThread() +
                                   "總和 = " + temp);
         }
     }.start(); // 啟動執行緒   	
   }
}