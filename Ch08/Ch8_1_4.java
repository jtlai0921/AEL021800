class Person {  // Person���O�ŧi
   public int id;          // �����r��
   private String name;    // �m�W
   private double height;  // ����
   // ������k: ���o�m�W
   public String getName() { return name; }
   // ������k: ���o����
   public double getHeight() { return height; }
   // ������k: �]�w�m�W
   public void setName(String n) { name = n; }
   // ������k: �]�w����
   public void setHeight(double h) { height = h; }
}
class Student extends Person {  // Student���O�ŧi
   private String id;     // ���æ����ܼ�
   private int grade;     // ���Z
   // �غc�l
   public Student(String id,String n,double h,int grade) {
      setName(n);  // �I�s�����O��������k
      setHeight(h);
      this.id = id;
      this.grade = grade;
   }
   // ������k: ��ܾǥ͸��
   public void studentInfo() {
      System.out.println("[�ǥ͸��]=====");
      System.out.println("�r��: " + id);
      System.out.println("�m�W: " + getName());
      System.out.println("����: " + getHeight());
      System.out.println("���Z: " + grade);
   }
}
// �D�{�����O
public class Ch8_1_4 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent���O���A���ܼ�, �åB�إߪ���
      Student mary =
              new Student("A2255","�p�s�k",165.0,65);
      // ��ܾǥ͸��
      mary.studentInfo();
   }
}