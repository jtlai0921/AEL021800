interface MyPerson {   // MyPerson�����ŧi
    private static String say() {
        return "��: ";
    }
    private String Hi() {
        return "�j�a�n!";
    }
    default void sayHi() {  // �w�]��k
        String r1 = say();
        String r2 = Hi();
        System.out.println(r1 + r2);
    }
}
// Joe���O��@MyPerson����
class Joe implements MyPerson {
    @Override
    public void sayHi() {   // �мgsayHi()��k
        System.out.print("��");
        MyPerson.super.sayHi();
    }
}
// �D���O
public class Ch10_6_4 {
    // �D�{��
    public static void main(String[] args) {
        Joe j = new Joe();   // �إ�Joe����
        j.sayHi();           // �I�s��k
    }
}