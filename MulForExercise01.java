package control;
import java.util.Scanner;
public class MulForExercise01 {
    public static void main(String[] args) {
        //1) ͳ�� 3 ����ɼ������ÿ������ 5 ��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
        //2) ͳ�������༰��������ÿ������ 5 ��ͬѧ��
        //˼·��������һ����ĳɼ����ܷ֣�ƽ���֣��������Ƕ��һ��forѭ�������ƶ������༶
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0; // ����һ������ͳ�������˵ĳɼ�
        int totalPass = 0; //��������
        for (int i = 1; i <= 3; i++) { //������
            double sum = 0;//�ɼ����ܺ�
            double average; //����
            for (int j = 1; j <= 5; j++) {  //��Ϊһ��5��ѧ��������j<=5
                System.out.println("�������"+i+"����" + j + "��ѧ���ĳɼ�");
                double score = myScanner.nextDouble();
                if (score >= 60){
                    totalPass++;
                }
                sum += score;  //sum = sum + score
                System.out.println("�ɼ�Ϊ" + score);
            }
            System.out.println("�ܷ�Ϊ" + sum);
            average = sum / 5;  // /�ǳ���
            System.out.println("ƽ����Ϊ" + average);
            totalScore += sum;
        }
        System.out.println("��������ܷ�Ϊ" + totalScore + "�������ƽ����Ϊ" + totalScore/15);
        System.out.println("�ܼ�������Ϊ"+ totalPass);
    }
}
