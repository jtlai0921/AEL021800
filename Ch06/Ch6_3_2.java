public class Ch6_3_2 {
   // �D�{��
   public static void main(String[] args) {
      // �}�C�ŧi
      char[] charArr = { ' ', 'J', 'a', 'v', 'a', ' ' };      
      String str = " JAVA "; // �ϥ�String���O�ŧi�r��
      // �ϥΫغc�l�إߦr�ꪫ��
      String str1, str2, str3, str4;
      str1 = new String(charArr);  // �ϥΦr���}�C
      str2 = new String("�{���y�����{���]�p");
      str3 = new String("How to use computer!");
      str4 = "use";
      System.out.println("str�r��:\"" + str + "\"");
      System.out.println("str1�r��:\"" + str1 + "\"");
      System.out.println("str2�r��:\"" + str2 + "\"");
      System.out.println("str3�r��:\"" + str3 + "\"");
      System.out.println("str4�r��:\"" + str4 + "\"");
      // ��ܦr����שM�j�p�g�ഫ
      System.out.print("str1����:"+str1.length());
      System.out.println("/str2����:"+str2.length());
      System.out.print("��p�g:"+str1.toLowerCase());
      System.out.println("/��j�g:"+str1.toUpperCase());
      // �j�M�r���M�l�r��
      System.out.print("�^-�r��indexOf(\'a\', 2): ");
      System.out.println(str1.indexOf('a', 2));
      System.out.print("�^-�r��lastIndexOf(\'b\',2): ");
      System.out.println(str1.lastIndexOf('b', 2));
      System.out.print("��-�r��indexOf(\"�y��\"): ");
      System.out.println(str2.indexOf("�y��"));
      System.out.print("��-�r��lastIndexOf(\"�y��\"):");
      System.out.println(str2.lastIndexOf("�y��"));
      // �l�r��M�r�����B�z
      System.out.print("�^��str1.charAt(4): ");
      System.out.println(str1.charAt(3));
      System.out.print("����str2.substring(2, 6): ");
      System.out.println(str2.substring(2, 6));
      System.out.print("���N-�^str1.replace('a','b'):");
      System.out.println(str1.replace('a','b'));
      System.out.print("�R���ťզr��str1.trim(): ");
      System.out.println(str1.trim());
      String str0 = str1.concat(str2); // �s����r��
      System.out.println("�s��str1.concat(str2): "+str0);
      // ��ܦr��str�Mstr1��������G
      System.out.print("���str�Pstr1�r��: ");
      System.out.println(str.compareTo(str1));
      System.out.print("���str�Pstr1�r��-�����j�p�g: ");
      System.out.println(str.compareToIgnoreCase(str1));
      // �r��str�Pstr1�O�_�۵�
      System.out.print("str�Pstr1�r��O�_�۵�: ");
      System.out.println(str.equals(str1));
      System.out.print("str�Pstr1�O�_�۵�-�����j�p�g: ");
      System.out.println(str.equalsIgnoreCase(str1));
      // �ˬd�r�ꪺ�r�Y�M�r��
      System.out.print("str4�������O�_��\"s\": ");
      System.out.println(str4.endsWith("s"));
      System.out.print("str4���r�Y�O�_��\"u\": ");
      System.out.println(str4.startsWith("u"));
   }
}