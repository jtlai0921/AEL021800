public class Ch4_3_1b {
    // 主程式 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入氣溫 =>");
        int t = sc.nextInt();
        if ( t >= 20 && t <=22 ) {
            System.out.println("加一件簿外套!");
        }
        System.out.println("今天氣溫 = " + t);
    }
}