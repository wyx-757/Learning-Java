package control;
import java.util.Scanner;
public class SwitchExercise02 {
    //��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ�
//���"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
//˼·����
//1. ����⣬����ʹ�� ��֧����ɣ� ����Ҫ��ʹ�� switch
//2. ����������Ҫ����һ��ת��, ���˼· :
// ����ɼ��� [60,100] , (int)(�ɼ�/60) = 1
// ����ɼ��� [0,60) , (int)(�ɼ�/60) = 0
//����ʵ��
//ʹ�� if-else ��֤����ĳɼ�����Ч�� 0-100
//���˵���ʦ�ķ����ʹ�����ʾ���Լ�һ��Ҫ�������
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������ɼ�");
        double score = myScanner.nextDouble();
        if (score > 0 && score < 100) {
            switch ((int) (score / 60)) {
                case 0:
                    System.out.println("���ϸ�");
                    break;
                case 1:
                    System.out.println("�ϸ�");
                    break;
                default:
                    System.out.println("��������");
                    break;
            }
        } else {
            System.out.println("�ɼ��������");
        }
    }
}