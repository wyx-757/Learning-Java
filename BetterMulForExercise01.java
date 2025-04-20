package control;
//AI�Ż���Ľ��


import java.util.InputMismatchException;
import java.util.Scanner;

public class BetterMulForExercise01 {
    // ���峣���������޸İ༶��ѧ������
    private static final int CLASS_COUNT = 3;
    private static final int STUDENT_COUNT = 5;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int totalPass = 0;

        for (int i = 1; i <= CLASS_COUNT; i++) {
            // ����ͳ�ư༶�ɼ��ͼ��������ķ���
            ClassResult result = calculateClassResult(myScanner, i);
            totalScore += result.sum;
            totalPass += result.passCount;
            System.out.println("�� " + i + " �����ܷ�Ϊ " + result.sum);
            System.out.println("�� " + i + " ����ƽ����Ϊ " + result.average);
        }
        System.out.println("��������ܷ�Ϊ " + totalScore + "���������ƽ����Ϊ " + totalScore / (CLASS_COUNT * STUDENT_COUNT));
        System.out.println("�ܼ�������Ϊ " + totalPass);
        myScanner.close();
    }

    // ͳ�Ƶ����༶�ĳɼ��ͼ�������
    private static ClassResult calculateClassResult(Scanner scanner, int classNumber) {
        double sum = 0;
        int passCount = 0;
        for (int j = 1; j <= STUDENT_COUNT; j++) {
            double score = getValidScore(scanner, classNumber, j);
            if (score >= 60) {
                passCount++;
            }
            sum += score;
        }
        double average = sum / STUDENT_COUNT;
        return new ClassResult(sum, average, passCount);
    }

    // ��ȡ�û��������Ч�ɼ�
    private static double getValidScore(Scanner scanner, int classNumber, int studentNumber) {
        double score = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("������� " + classNumber + " ����� " + studentNumber + " ��ѧ���ĳɼ���0 - 100����");
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) {
                    validInput = true;
                } else {
                    System.out.println("����ĳɼ����� 0 - 100 ��Χ�ڣ����������롣");
                }
            } catch (InputMismatchException e) {
                System.out.println("������Ч��������һ����Ч�����֡�");
                scanner.nextLine();
            }
        }
        return score;
    }

    // �ڲ��࣬���ڴ洢�༶��ͳ�ƽ��
    static class ClassResult {
        double sum;
        double average;
        int passCount;

        ClassResult(double sum, double average, int passCount) {
            this.sum = sum;
            this.average = average;
            this.passCount = passCount;
        }
    }
}
