public class Ch3_4_2 {
    // 主程式 
    public static void main(String[] args) {
        int var3 = 10;        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入運算元1 =>");
        int var1 = sc.nextInt();
        System.out.print("請輸入運算元2 =>");
        int var2 = sc.nextInt();
        var3 = var1 * var2;
        System.out.println("相乘結果 = " + var3);
        var3 = var1 / var2;
        System.out.println("相除結果 = " + var3);		
    }
}