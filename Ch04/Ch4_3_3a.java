public class Ch4_3_3a {
    // �D�{�� 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J�~�� =>");
        int a = sc.nextInt();
        if (a < 13) {
            System.out.println("�ൣ");
        }
        if (a >= 13 && a < 20) {
            System.out.println("�C�֦~");
        }
        if (a >= 20) {
            System.out.println("���~�H");
        }		
    }
}