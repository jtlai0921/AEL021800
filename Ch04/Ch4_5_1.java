public class Ch4_5_1 {
    // 祘Α 
    public static void main(String[] args) { 
        int a = 3;   // 跑计
        int b = 5;
        int c = 2;
        if (a > b && a > c) {
            System.out.println( "跑计 a 程!");
        }
        else {
            if (b > c) {
                System.out.println( "跑计 b 程!");
            }
            else {
                System.out.println( "跑计 c 程!");
            }
        }	
    }
}