public class Ch4_3_2a {
    // �D�{�� 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J���Z =>");
        int s = sc.nextInt();
        if (s >= 60) {
            System.out.println("���Z�ή�!");
        }
        if (s < 60) {
            System.out.println("���Z���ή�!");
        }		
    }
}