public class Ch4_4_3 {
    // 主程式 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入整數 =>");
        int max = sc.nextInt();
        int n = 1, r = 1;
        do {
            r = r * n;
            n = n + 1;
        } while ( n <= max );
        System.out.println("階層值! = " + r);		
    }
}