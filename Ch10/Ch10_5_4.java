import java.util.*;
public class Ch10_5_4 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����HashSet�ŧi
      HashSet<String> hset = new HashSet<String>();
      hset.add("���|�w");
      hset.add("���p��");
      hset.add("������");
      System.out.println("HashSet���e: " + hset);
      // �ϥ�Iterator�������HashSet����
      Iterator<String> iterator = hset.iterator();
      System.out.print("HashSet���X(iterator):");
      while (iterator.hasNext())
         System.out.print(" "+iterator.next());
      System.out.println();      
   }
}