class Student {  // Student���O�ŧi
   // �����ܼ�
   private String name;   // �m�W
   private String address;// �a�}
   private int age;       // �~�� 
   // ������k: ��ܾǥͦW�P���
   public void printNameCard() {
      System.out.println("�m�W: " + name);
      System.out.println("�a�}: " + address);
      System.out.println("�~��: " + age);
      System.out.println("-------------------");
   }
   // ������k: �]�w�m�W���
   public void setName(String n){ name = n; }
   // ������k: �]�w�a�}���
   public void setAddress(String a){ address = a; }
   // ������k: �]�w�~�ָ��
   public void setAge(int v) { age = v; }
   // ������k: �Ǧ^�m�W
   public String getName(){ return name; }
   // ������k: �Ǧ^���
   public String getAddress(){ return address; }
   // ������k: �Ǧ^�~��
   public int getAge(){ return age; }
}
// �D�{�����O
public class Ch7_3_2 { 
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent�����ܼƥB�إߪ���
      Student joe = new Student();
      Student jane = new Student();
      joe.setName("���|�w");  // �I�s��k�]�wjoe���
      joe.setAddress("�s�_�]");
      joe.setAge(37);      
      jane.setName("���p��"); // �I�s��k�]�wjane���
      jane.setAddress("�x�_��");
      jane.setAge(30);
      jane.printNameCard();   // �I�s��k��ܾǥ͸��
      // ���o�ǥ͸��
      String name = joe.getName();
      String address = joe.getAddress();
      int age = joe.getAge();
      // ��ܾǥ͸��
      System.out.println("[�m�W]: " + name);
      System.out.println("[�a�}]: " + address);
      System.out.println("[�~��]: " + age);
   }
}