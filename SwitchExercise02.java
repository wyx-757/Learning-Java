package control;
import java.util.Scanner;
public class SwitchExercise02 {
    //对学生成绩大于 60 分的，输出"合格"。低于 60 分的，
//输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
//思路分析
//1. 这道题，可以使用 分支来完成， 但是要求使用 switch
//2. 这里我们需要进行一个转换, 编程思路 :
// 如果成绩在 [60,100] , (int)(成绩/60) = 1
// 如果成绩在 [0,60) , (int)(成绩/60) = 0
//代码实现
//使用 if-else 保证输入的成绩有有效的 0-100
//看了当老师的分析和代码演示后，自己一定要独立完成
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = myScanner.nextDouble();
        if (score > 0 && score < 100) {
            switch ((int) (score / 60)) {
                case 0:
                    System.out.println("不合格");
                    break;
                case 1:
                    System.out.println("合格");
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        } else {
            System.out.println("成绩输入错误");
        }
    }
}