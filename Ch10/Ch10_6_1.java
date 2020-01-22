import java.util.Arrays;
import java.util.Comparator;
class Student { // Student���O
    private String name;
    public Student(String name) { this.name = name; }
    public String getName() { return name; }
}
// �D���O
public class Ch10_6_1 {
    // �D�{��	
    public static void main(String[] args) {
        Student[] std1 = {new Student("Tom"),new Student("Jane"),new Student("Mary")};
        Student[] std2 = {new Student("Tom"),new Student("Jane"),new Student("Mary")};
        // ����}�C���ƧǤ�k, �ϥζǲ�Comparator����
        Arrays.sort(std1, new Comparator<Student>() {
            // �мgcompare()��k
            public int compare(Student first, Student second) {
                return first.getName().compareTo(second.getName());
            }
        }); // ��ܾǥͩm�W�M��
        for (Student std : std1) {
            System.out.println(std.getName());
        }
        System.out.println("------------------");
        // ����}�C���ƧǤ�k, �ϥ�Lambda�B�⦡
        Arrays.sort(std2,(first,second) -> first.getName().compareTo(second.getName()));
        // ��ܾǥͩm�W�M��
        for (Student std : std2) {
            System.out.println(std.getName());
        }
    }
}