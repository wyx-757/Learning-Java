package control;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {
        //使用 switch 把小写类型的 char 型转为大写(键盘输入)。只转换 a, b, c, d, e. 其它的输出 "other"
        Scanner myScanner =new Scanner(System.in);
        System.out.println("请输入a-e");
        char c1 = myScanner.next().charAt(0);
        switch (c1){
            case 'a' :
                System.out.println("A");
                break;
            case 'b' :
                System.out.println("B");
                break;
            case 'c' :
                System.out.println("C");
                break;
            case 'd' :
                System.out.println("D");
                break;
            case 'e' :
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
//对学生成绩大于 60 分的，输出"合格"。低于 60 分的，
//输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
//思路分析
//1. 这道题，可以使用 分支来完成， 但是要求使用 switch
//2. 这里我们需要进行一个转换, 编程思路 :
// 如果成绩在 [60,100] , (int)(成绩/60) = 1
// 如果成绩在 [0,60) , (int)(成绩/60) = 0
    }
}
