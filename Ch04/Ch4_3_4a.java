public class Ch4_3_4a {
   // �D�{��
   public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("�п�JGPA���Z =>");
      String gpa = sc.nextLine();
      switch ( gpa ) {
          case "A":
             System.out.println("�ǥͦ��Z�W�L:80");
             break;
          case "B":
             System.out.println("�ǥͦ��Z:70~79");
             break;
          case "C":
             System.out.println("�ǥͦ��Z:60~69");
             break;
          default:
             System.out.println("�ǥͦ��Z���ή�!");
      }
   }
}