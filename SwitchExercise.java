package control;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {
        //ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��ֻת�� a, b, c, d, e. ��������� "other"
        Scanner myScanner =new Scanner(System.in);
        System.out.println("������a-e");
        char c1 = myScanner.next().charAt(0);
        switch (c1){
            case 'a' :
                System.out.println("A");
                break;
            case 'b' :
                System.out.println("B");
                break;
            case 'c' :
                System.out.println("C");
                break;
            case 'd' :
                System.out.println("D");
                break;
            case 'e' :
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
//��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ�
//���"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
//˼·����
//1. ����⣬����ʹ�� ��֧����ɣ� ����Ҫ��ʹ�� switch
//2. ����������Ҫ����һ��ת��, ���˼· :
// ����ɼ��� [60,100] , (int)(�ɼ�/60) = 1
// ����ɼ��� [0,60) , (int)(�ɼ�/60) = 0
    }
}
