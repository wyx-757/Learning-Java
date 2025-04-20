package control;
//AI优化后的结果


import java.util.InputMismatchException;
import java.util.Scanner;

public class BetterMulForExercise01 {
    // 定义常量，便于修改班级和学生数量
    private static final int CLASS_COUNT = 3;
    private static final int STUDENT_COUNT = 5;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int totalPass = 0;

        for (int i = 1; i <= CLASS_COUNT; i++) {
            // 调用统计班级成绩和及格人数的方法
            ClassResult result = calculateClassResult(myScanner, i);
            totalScore += result.sum;
            totalPass += result.passCount;
            System.out.println("第 " + i + " 个班总分为 " + result.sum);
            System.out.println("第 " + i + " 个班平均分为 " + result.average);
        }
        System.out.println("三个班的总分为 " + totalScore + "，三个班的平均分为 " + totalScore / (CLASS_COUNT * STUDENT_COUNT));
        System.out.println("总及格人数为 " + totalPass);
        myScanner.close();
    }

    // 统计单个班级的成绩和及格人数
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

    // 获取用户输入的有效成绩
    private static double getValidScore(Scanner scanner, int classNumber, int studentNumber) {
        double score = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("请输入第 " + classNumber + " 个班第 " + studentNumber + " 个学生的成绩（0 - 100）：");
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) {
                    validInput = true;
                } else {
                    System.out.println("输入的成绩不在 0 - 100 范围内，请重新输入。");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入无效，请输入一个有效的数字。");
                scanner.nextLine();
            }
        }
        return score;
    }

    // 内部类，用于存储班级的统计结果
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
