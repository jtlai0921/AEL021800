public class Ch4_4_2 {
    // �D�{�� 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J���h�� =>");
        int max = sc.nextInt();
        int n = 1, r = 1;
        while ( n <= max ) {
            r = r * n;
            n = n + 1;
        }
        System.out.println("���h��! = " + r);	
    }
}