public class Ch5_3_1 {
   // ���O�ܼƫŧi
   static int no = 1;
   // ���O��k
   static void funcA() {
      no = 3;    // ���w���O�ܼƭ�
   }
   // �D�{��
   public static void main(String[] args) {
      System.out.println("���O�ܼƪ�� : " + no);
      no = 2;   // ���w���O�ܼƭ�
      System.out.println("�I�sfuncA �e : " + no);
      funcA();  // �I�s���O��k
      System.out.println("�I�sfuncA �� : " + no);
   }
}