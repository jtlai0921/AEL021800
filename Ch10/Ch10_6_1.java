import java.util.Arrays;
import java.util.Comparator;
class Student { // Student類別
    private String name;
    public Student(String name) { this.name = name; }
    public String getName() { return name; }
}
// 主類別
public class Ch10_6_1 {
    // 主程式	
    public static void main(String[] args) {
        Student[] std1 = {new Student("Tom"),new Student("Jane"),new Student("Mary")};
        Student[] std2 = {new Student("Tom"),new Student("Jane"),new Student("Mary")};
        // 物件陣列的排序方法, 使用傳統Comparator物件
        Arrays.sort(std1, new Comparator<Student>() {
            // 覆寫compare()方法
            public int compare(Student first, Student second) {
                return first.getName().compareTo(second.getName());
            }
        }); // 顯示學生姓名清單
        for (Student std : std1) {
            System.out.println(std.getName());
        }
        System.out.println("------------------");
        // 物件陣列的排序方法, 使用Lambda運算式
        Arrays.sort(std2,(first,second) -> first.getName().compareTo(second.getName()));
        // 顯示學生姓名清單
        for (Student std : std2) {
            System.out.println(std.getName());
        }
    }
}