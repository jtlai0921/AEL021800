public class Ch4_3_3 {
    // 主程式 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入年齡 =>");
        int a = sc.nextInt();
        if (a < 13) {
            System.out.println("兒童");
        }
        else if (a < 20) {
            System.out.println("青少年");
        }
        else {
            System.out.println("成年人");
        }		
    }
}