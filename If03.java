package control;
import java.util.Scanner;
public class If03 {
    public static void main(String[] args) {
/*
* ������ʾ 1
���뱣��ͬ־��֥�����÷֣������
1) ���÷�Ϊ 100 ��ʱ����� ���ü��ã�
2) ���÷�Ϊ(80��99]ʱ����� �������㣻
3) ���÷�Ϊ[60,80]ʱ����� ����һ�㣻
4) ������� ����� ���� ������
5) ��Ӽ������뱣����֥�����÷֣��������ж�*/

        Scanner myScanner = new Scanner(System.in);
        System.out.println("���������");
        int mark = myScanner.nextInt();
        //�Է������з�Χ�Ľ綨
        if (mark >= 1 && mark <= 100) {
            //�ĸ����֧
            if (mark == 100) {
                System.out.println("���ü���");
            } else if (mark > 80 && mark <= 99) {
                System.out.println("����");
            } else if (mark <= 80 && mark >= 60) {
                System.out.println("һ���");
            } else {
                System.out.println("���ϸ�");
            }
        }else
        //�������������100��С��1�������restart
            System.out.println("restart");
    }
}
