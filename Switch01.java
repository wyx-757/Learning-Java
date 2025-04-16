package control;
import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
        //a 表示星期一，b 表示星期二 …
        //根据用户的输入显示相应的信息.要求使用 switch 语句完成
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入字符");
        char c1 = myScanner.next().charAt(0);
        //只要有值返回，就是一个表达式
        switch (c1) {
            case 'a' :
                System.out.println("Monday");
                break;
            case 'b' :
                System.out.println("Tuesday");
                break;
            case 'c' :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("no");
                break;

        }

    }
}
