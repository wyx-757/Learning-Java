package control;
import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c,d,e,f,g
        //a ��ʾ����һ��b ��ʾ���ڶ� ��
        //�����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ�� switch ������
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�������ַ�");
        char c1 = myScanner.next().charAt(0);
        //ֻҪ��ֵ���أ�����һ�����ʽ
        switch (c1) {
            case 'a' :
                System.out.println("Monday");
                break;
            case 'b' :
                System.out.println("Tuesday");
                break;
            case 'c' :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("no");
                break;

        }

    }
}
