public class Ch7_3_1 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiStudent���O���A���ܼ�
      Student joe, jane, current, empty;
      // �إߪ�����
      joe = new Student();
      jane = new Student();
      current = joe;
      empty = null;  // ���w��null�Ѧ�
      joe.name = "���|�w";  // �]�wjoe�����ܼ�
      joe.address = "�s�_��";
      joe.age = 37;
      jane.name = "���p��"; // �]�wjane�����ܼ�
      jane.address = "�x�_��";
      jane.age = 30;
      joe.printNameCard();  // �I�s���󪺤�k
      jane.printNameCard();
      current.printNameCard();
   }
}