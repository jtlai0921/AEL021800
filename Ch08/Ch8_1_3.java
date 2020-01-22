class Person {  // Person���O�ŧi
   private int id;         // �����r��
   private String name;    // �m�W
   private double height;  // ����
   // ���O��k: ������O�W��
   public static void printClassName() {
      System.out.println("���O�W��: Person");
   }
   // ������k: ���o�����r��
   public int getID() { return id; }
   // ������k: ���o�m�W
   public String getName() { return name; }
   // ������k: ���o����
   public double getHeight() { return height; }
   // ������k: �]�w�����r��
   public void setID(int id) { this.id = id; }
   // ������k: �]�w�m�W
   public void setName(String n) { name = n; }
   // ������k: �]�w����
   public void setHeight(double h) { height = h; }
   // ������k: ��ܭӤH���
   public void personInfo() {
      System.out.println("�r��: " + id);
      System.out.println("�m�W: " + name);
      System.out.println("����: " + height);
   }
}
class Student extends Person {  // Student���O�ŧi
   private int grade;     // ���Z
   // �غc�l
   public Student(int id,String n,double h, int grade) {
      setID(id);      // �I�s�����O��������k
      setName(n);
      setHeight(h);
      this.grade = grade;
   }
   // �������O��k: ������O�W��
   public static void printClassName() {
      System.out.println("���O�W��: Student");
   }
   // ������k: ��ܾǥ͸��
   public void personInfo() {
      System.out.println("[�ǥ͸��]=====");
      System.out.println("�r��: " + getID());
      System.out.println("�m�W: " + getName());
      System.out.println("����: " + getHeight());
      System.out.println("���Z: " + grade);
   }
}
// �D�{�����O
public class Ch8_1_3 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent���O���A���ܼ�, �åB�إߪ���
      Student tom = new Student(2234,"�i�L��",185.0,55);
      // ��ܾǥ͸��
      tom.printClassName();
      tom.personInfo();
   }
}