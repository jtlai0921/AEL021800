class Person {  // Person���O�ŧi
   public static int count = 0; // �p��ǥͼ�
   public int id;               // �����r��
   public String name;          // �m�W
   // �غc�l
   public Person(int id, String name) {
      this.id = id;
      this.name = name;
      count++;
   }
   // ������k: ��ܭӤH���
   public void personInfo() {
      System.out.println("===[�ӤH���]=====");
   }
}
class Student extends Person {  // Student���O�ŧi
   private String id;    // ���æ����ܼ�
   private String name;
   private int grade;    // ���Z
   // �غc�l
   public Student(int id,String n,String no,int grade) {
      super(id, n);      // �I�s�����O���غc�l
      name = "�ǥ�";
      this.id = no;
      this.grade = grade;
   }
   // ������k: ��ܾǥ͸��
   public void personInfo() {
      super.personInfo();
      System.out.println("�m�W(��): " + super.name);
      System.out.println("�r��(��): " + super.id);
      System.out.println("¾�~(�l): " + name);
      System.out.println("�Ǹ�(�l): " + id);
      System.out.println("�ǥͼ�: " + count);
      System.out.println("���Z: " + grade);
   }
}
// �D�{�����O
public class Ch8_1_5 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent���O���A���ܼ�, �åB�إߪ���
      Student joe = new Student(1234,"���|�w","S102",85);
      Student tom = new Student(3467,"������","S222",75);
      // ��ܾǥ͸��
      joe.personInfo();
      tom.personInfo();
   }
}