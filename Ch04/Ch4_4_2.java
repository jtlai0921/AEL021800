public class Ch4_4_2 {
    // 主程式 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入階層數 =>");
        int max = sc.nextInt();
        int n = 1, r = 1;
        while ( n <= max ) {
            r = r * n;
            n = n + 1;
        }
        System.out.println("階層值! = " + r);	
    }
}