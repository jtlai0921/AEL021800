// 函數介面
interface WorkerInterface {
    public void doJob();
}
// 函數介面的測試類別
class Worker {
    public static void execute(WorkerInterface myWorker) {
        myWorker.doJob();
    }
}
// 主類別
public class Ch10_6_2 {
    // 主程式
    public static void main(String[] args) {
        // 使用Lambda運算式呼叫doJob()方法 
        Worker.execute(() -> System.out.println("使用Lambda運算式呼叫doJob()方法"));
        // 使用匿名類別來呼叫doJob()方法
        Worker.execute(new WorkerInterface() {
            // 覆寫doJob()方法
            public void doJob() {
                System.out.println("使用匿名類別來呼叫doJob()方法");
            }
        });
    }
}