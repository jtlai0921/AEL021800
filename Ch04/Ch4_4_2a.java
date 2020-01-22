public class Ch4_4_2a {
    // 主程式 
    public static void main(String[] args) { 
        int max = 100, r = 1;
        int n = 1;
        while ( r <= 100 ) {
            r = r * n;
            n = n + 1;
        }  
        System.out.println("大於100的階層n! = " + (n-1));
    }
}