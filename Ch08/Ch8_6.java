class Person {   // Person���O�ŧi
   public String name;   // �m�W
   public String address;// �a�}
   // ������k: �Ǧ^�m�W
   public final String getName() { return name; }
   // ������k: �Ǧ^�a�}
   public final String getAddress() { return address; }
   // ������k: �]�w�m�W
   public final void setName(String n) { name = n; }
   // ������k: �]�w�a�}
   public final void setAddress(String a) {address = a;}
}
// Customer���O�ŧi
final class Customer extends Person {
   public String shippingAddress;  // �e�f�a�}
   // �غc�l
   public Customer(String n,String a,String shipping) {
      setName(n);
      setAddress(a);
   	  shippingAddress = shipping;
   }
   // ������k: ��ܫȤ���
   public void customerInfo() {
      System.out.println("-------------------");
      System.out.println(" �m�W: " + getName());
      System.out.println(" �a�}: " + getAddress());
      System.out.println(" �e�f�a�}: "+shippingAddress);
      System.out.println("-------------------");
   }
}
// �D�{�����O
public class Ch8_6 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiCustomer���O���A���ܼ�, �åB�إߪ���
      Customer joe = new Customer("���|�w",
                         "�x�_��","����]");
      joe.customerInfo();  // �I�s���󪺤�k
   }
}