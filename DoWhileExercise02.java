package control;
import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        //�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪ
        //[System.out.println("�Ϻ��ʣ���Ǯ��y/n")]
       Scanner myScanner = new Scanner(System.in);
       char answer = ' ';
       do {
           System.out.println("������");
           answer = myScanner.next().charAt(0);
       }while (answer != 'y');


    }
}
