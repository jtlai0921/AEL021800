public class Ch4_4_2a {
    // �D�{�� 
    public static void main(String[] args) { 
        int max = 100, r = 1;
        int n = 1;
        while ( r <= 100 ) {
            r = r * n;
            n = n + 1;
        }  
        System.out.println("�j��100�����hn! = " + (n-1));
    }
}