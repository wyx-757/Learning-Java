package control;
import java.util.Scanner;

public class NestedIfPra01 {
    public static void main(String[] args) {
        /*��Ʊϵͳ�����ݵ����������·ݺ����䣬��ӡƱ��
        * 4 - 10 ����
        * ���ˣ�18-60����60
        * ��ͯ��<18�������
        * ����(>60) ����֮һ
        * ����
        * ����40������20*/
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�������·�");
        int month = myScanner.nextInt();
        System.out.println("����������");
        int age = myScanner.nextInt();
        if (month >= 4 && month<= 10){
            if (age >= 18 && age<= 60){
                System.out.println("Ʊ��60");
            } else if (age <= 18) {
                System.out.println("Ʊ��30");
            }else {
                System.out.println("Ʊ��20");
            }
        }else {
            if (age >= 18 && age<= 60){
                System.out.println("Ʊ��40");
            }else {
                System.out.println("Ʊ��20");
            }
        }
    }
}
