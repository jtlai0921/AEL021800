public class Ch5_3_2 {
   // ���O�ܼƫŧi
   static int a = 1;
   static double b = 2.0;
   // ���O��k: �ϰ��ܼƪ��d��
   static void funcA() {
      System.out.println("funcA�ܼƫŧi�e: "+a+" - "+b);
      // �ϰ��ܼƫŧi
      int a = 3;
      double b = 4.0;
      System.out.println("funcA�ܼƫŧi��: "+a+" - "+b);
   }
   // ���O��k: ��k�Ѽƪ��d��
   static void funcB(int a, double b) {
      System.out.println("funcB�ѼƳ]�w�e: "+a+" - "+b);
      a = 3;   // �]�w�Ѽ��ܼ�
      b = 4.0; // �]�w�Ѽ��ܼ�
      System.out.println("funcB�ѼƳ]�w��: "+a+" - "+b);
   }
   // ���O��k: ���O�ܼƪ��d��
   static void funcC() {
      a = 3;   // �]�w���O�ܼ�
      b = 4.0; // �]�w���O�ܼ�
   }
   // �D�{��
   public static void main(String[] args) {
      System.out.println("�I�sfuncA�e: "+a+" - "+b);
      funcA();        // �I�s���O��k
      System.out.println("�I�sfuncA��: "+a+" - "+b);
      System.out.println("�I�sfuncB�e: "+a+" - "+b);
      funcB(5, 6.0);  // �I�s���O��k
      System.out.println("�I�sfuncB��: "+a+" - "+b);
      System.out.println("�I�sfuncC�e: "+a+" - "+b);
      funcC();        // �I�s���O��k
      System.out.println("�I�sfuncC��: "+a+" - "+b);
   }
}