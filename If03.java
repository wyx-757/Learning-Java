package control;
import java.util.Scanner;
public class If03 {
    public static void main(String[] args) {
/*
* 案例演示 1
输入保国同志的芝麻信用分：如果：
1) 信用分为 100 分时，输出 信用极好；
2) 信用分为(80，99]时，输出 信用优秀；
3) 信用分为[60,80]时，输出 信用一般；
4) 其它情况 ，输出 信用 不及格
5) 请从键盘输入保国的芝麻信用分，并加以判断*/

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入分数");
        int mark = myScanner.nextInt();
        //对分数进行范围的界定
        if (mark >= 1 && mark <= 100) {
            //四个多分支
            if (mark == 100) {
                System.out.println("信用极好");
            } else if (mark > 80 && mark <= 99) {
                System.out.println("优秀");
            } else if (mark <= 80 && mark >= 60) {
                System.out.println("一般般");
            } else {
                System.out.println("不合格");
            }
        }else
        //如果输入结果大于100或小于1，则出现restart
            System.out.println("restart");
    }
}
