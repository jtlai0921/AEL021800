public class Ch4_4_1b {
    // �D�{�� 
    public static void main(String[] args) { 
        int sum = 0;        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J�̤j�� =>");
        int max = sc.nextInt();      
        for (int i = max; i >= 1; i--) {
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("�`�M = " + sum);		
    }
}