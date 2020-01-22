class Student {  // Student���O�ŧi
   // �����ܼ�
   private String name;   // �m�W
   private String address;// �a�}
   private int age;       // �~��
   // �غc�l(1): �ϥΰѼƳ]�w�����ܼƪ�l��
   public Student(String n, String a, int v) {
      name = n;            // �]�w�m�W
      address = a;         // �]�w�a�}
      if ( validAge(v) ) age = v;  // �]�w�~��
      else           age = 20; // �~�֪��
   } 
   // �غc�l(2): �ϥΰѼƳ]�w�����ܼƪ�l��
   public Student(String n, String a) {
      name = n;            // �]�w�m�W
      address = a;         // �]�w�a�}
      age = 20;            // �~�֪��
   }
   // ������k: ��ܾǥͦW�P���
   public void printNameCard() {
      System.out.println("�m�W: " + name);
      System.out.println("�a�}: " + address);
      System.out.println("�~��: " + age);
      System.out.println("-------------------");
   }   
   // ������k: �Ǧ^�m�W
   public String getName(){ return name; }
   // ������k: �Ǧ^���
   public String getAddress(){ return address; }
   // ������k: �Ǧ^�~��
   public int getAge(){ return age; }
   // ������k: �ˬd�~�ָ��
   private boolean validAge(int a) {
      // �ˬd�~�ָ�ƬO�_�b�d��
      if ( a < 20 || a > 50 ) return false;
      else  return true;   // �X�k���~�ָ��
   }
}
// �D�{�����O
public class Ch7_6a {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent�����ܼƥB�إߪ���
      var tom = new Student("���L",
                        "�x����", 27);
      var mary = new Student("�p�s�k","�����]");
      tom.printNameCard();  // ��ܾǥ͸��
      mary.printNameCard();
   }
}