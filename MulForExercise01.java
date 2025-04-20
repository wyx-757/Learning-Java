package control;
import java.util.Scanner;
public class MulForExercise01 {
    public static void main(String[] args) {
        //1) 统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
        //2) 统计三个班及格人数，每个班有 5 名同学。
        //思路，先做出一个班的成绩，总分，平均分，再在外层嵌套一个for循环，来制定三个班级
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0; // 定义一个变量统计所有人的成绩
        int totalPass = 0; //及格人数
        for (int i = 1; i <= 3; i++) { //三个班
            double sum = 0;//成绩的总和
            double average; //均分
            for (int j = 1; j <= 5; j++) {  //因为一共5个学生，所以j<=5
                System.out.println("请输入第"+i+"个班" + j + "个学生的成绩");
                double score = myScanner.nextDouble();
                if (score >= 60){
                    totalPass++;
                }
                sum += score;  //sum = sum + score
                System.out.println("成绩为" + score);
            }
            System.out.println("总分为" + sum);
            average = sum / 5;  // /是除号
            System.out.println("平均分为" + average);
            totalScore += sum;
        }
        System.out.println("三个班的总分为" + totalScore + "三个班的平均分为" + totalScore/15);
        System.out.println("总及格人数为"+ totalPass);
    }
}
