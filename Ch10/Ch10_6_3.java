interface MyPerson {   // MyPerson�����ŧi
    default void sayHi() {  // �w�]��k
        System.out.println("�j�a�n!");
    }
}
interface MyStudent {   // MyStudent�����ŧi
    default void sayHi() {   // �w�]��k
        System.out.println("Hi!");
    }
}
// Joe���O��@MyPerson�MMyStudent����
class Joe implements MyPerson, MyStudent {
    @Override
    public void sayHi() {   // �мgsayHi()��k
        MyStudent.super.sayHi();
    }
}
// �D���O
public class Ch10_6_3 {
    // �D�{��
    public static void main(String[] args) {
        Joe j = new Joe();   // �إ�Joe����
        j.sayHi();           // �I�s��k
    }
}