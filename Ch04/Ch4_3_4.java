public class Ch4_3_4 {
    // �D�{�� 
    public static void main(String[] args) { 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J�ﶵ�� =>");
        int c = sc.nextInt();
        switch (c) {
        case 1:
            System.out.println("��J�ﶵ�ȬO1!");
            break;
        case 2:
            System.out.println("��J�ﶵ�ȬO2!");
            break;
        case 3:
            System.out.println("��J�ﶵ�ȬO3!");
            break;   
        default:
            System.out.println("�п�J1~3�ﶵ��!");
            break;
        }		
    }
}