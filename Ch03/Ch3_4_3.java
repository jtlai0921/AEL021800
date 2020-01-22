public class Ch3_4_3 {
    // 主程式 
    public static void main(String[] args) { 
        double f = 12.3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入攝氏溫度 =>");
        int c = sc.nextInt();
        f = (9.0 * c) / 5.0 + 32.0;
        System.out.println("華氏溫度 = " + f);		
    }
}