public class Ch4_4_3 {
    // �D�{�� 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J��� =>");
        int max = sc.nextInt();
        int n = 1, r = 1;
        do {
            r = r * n;
            n = n + 1;
        } while ( n <= max );
        System.out.println("���h��! = " + r);		
    }
}