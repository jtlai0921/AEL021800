interface MyPerson {   // MyPerson介面宣告
    private static String say() {
        return "說: ";
    }
    private String Hi() {
        return "大家好!";
    }
    default void sayHi() {  // 預設方法
        String r1 = say();
        String r2 = Hi();
        System.out.println(r1 + r2);
    }
}
// Joe類別實作MyPerson介面
class Joe implements MyPerson {
    @Override
    public void sayHi() {   // 覆寫sayHi()方法
        System.out.print("請");
        MyPerson.super.sayHi();
    }
}
// 主類別
public class Ch10_6_4 {
    // 主程式
    public static void main(String[] args) {
        Joe j = new Joe();   // 建立Joe物件
        j.sayHi();           // 呼叫方法
    }
}