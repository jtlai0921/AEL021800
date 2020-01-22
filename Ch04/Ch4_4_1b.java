public class Ch4_4_1b {
    // 主程式 
    public static void main(String[] args) { 
        int sum = 0;        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入最大值 =>");
        int max = sc.nextInt();      
        for (int i = max; i >= 1; i--) {
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("總和 = " + sum);		
    }
}