interface IValue {  // IValue����
   int value();
}
class MyValue { // MyValue���O
   private int v = 50;
   // ���oIValue����	
   public IValue getIValueObject() {
	  final int v2 = 10; 
      // �إ߰ΦW���h���O������
	  IValue temp = new IValue() { 
		 private int v = 20; 
         public int value() {
        	int v = 30;
            return MyValue.this.v + 
           	         this.v + v + v2;
     	 }
      }; 
      return temp;
   }
}
//�D�{�����O
public class Ch9_2_3 {
   // �D�{��
   public static void main(String[] args) {
      // �إ�MyValue����
      MyValue mv = new MyValue();
      // ���oIValue��������
      IValue c = mv.getIValueObject();
      // ��ܤ�k���Ǧ^��
      System.out.println("���o��= " + c.value());
   }
}