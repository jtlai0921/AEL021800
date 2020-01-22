public class Ch4_3_2a {
    // 主程式 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入成績 =>");
        int s = sc.nextInt();
        if (s >= 60) {
            System.out.println("成績及格!");
        }
        if (s < 60) {
            System.out.println("成績不及格!");
        }		
    }
}