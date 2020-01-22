public class Ch4_3_4 {
    // 主程式 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入選項值 =>");
        int c = sc.nextInt();
        switch (c) {
        case 1:
            System.out.println("輸入選項值是1!");
            break;
        case 2:
            System.out.println("輸入選項值是2!");
            break;
        case 3:
            System.out.println("輸入選項值是3!");
            break;   
        default:
            System.out.println("請輸入1~3選項值!");
            break;
        }		
    }
}