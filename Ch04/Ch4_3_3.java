public class Ch4_3_3 {
    // �D�{�� 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J�~�� =>");
        int a = sc.nextInt();
        if (a < 13) {
            System.out.println("�ൣ");
        }
        else if (a < 20) {
            System.out.println("�C�֦~");
        }
        else {
            System.out.println("���~�H");
        }		
    }
}