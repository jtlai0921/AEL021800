public class Ch4_4_1 {
    // �D�{�� 
    public static void main(String[] args) { 
        int sum = 0;        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J�̤j�� =>");
        int max = sc.nextInt();        
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println("�`�M = " + sum);		
    }
}