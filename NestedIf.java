/*
��һ����֧�ṹ����������Ƕ������һ�������ķ�֧�ṹ������ķ�֧�Ľṹ��Ϊ�ڲ��֧����ķ�֧�ṹ��Ϊ��
���֧����ʦ����: ��Ҫ���� 3 �� ���ɶ��Բ��ã�
*/
package control;
import java.util.Scanner;


public class NestedIf {
    public static void main(String[] args) {
        /*
        �μӸ��ֱ�������������ɼ����� 8.0 ���������������ʾ��̭�����Ҹ����Ա���ʾ�����������Ů���顣
        ����ɼ����Ա𣬽����жϺ������Ϣ��
        */
//1. ���� Scanner ���󣬽����û�����
//2. ���� �ɼ����浽 double score
//3. ʹ�� if-else �ж� ��������ɼ����� 8.0 ���������������ʾ��̭
//4. ������뵽 �������ٽ��� char gender, ʹ�� if-else �����Ϣ
        Scanner myscannner = new Scanner(System.in);
        System.out.println("������ɼ�");
        double grade = myscannner.nextDouble();
        //char gender = myscannner.next().charAt(0);
        if (grade > 8.0){
            System.out.println("�������Ա�");
            char gender = myscannner.next().charAt(0);
            //һ��Ҫ�ñȽ������==
            if (gender == '��'){
                System.out.println("����������");
            } else if (gender == 'Ů') {
                System.out.println("����Ů����");
            }else {
                System.out.println("�Ա��������");
            }

        }else {
            System.out.println("��̭");
        }

    }
}

