public class Ch3_4_2 {
    // �D�{�� 
    public static void main(String[] args) {
        int var3 = 10;        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("�п�J�B�⤸1 =>");
        int var1 = sc.nextInt();
        System.out.print("�п�J�B�⤸2 =>");
        int var2 = sc.nextInt();
        var3 = var1 * var2;
        System.out.println("�ۭ����G = " + var3);
        var3 = var1 / var2;
        System.out.println("�۰����G = " + var3);		
    }
}