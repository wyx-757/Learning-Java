package control;
import java.util.Scanner;

public class IfExcercise01 {
    //编写程序，声明 2 个 double 型变量并赋值。判断第一个数大于 10.0，且第 2 个数小于 20.0，打印两数之和
    public static void main(String[] args) {
        double a = 11.1;
        double b = 19.8;
        if (a > 10.0){
            if (b < 20.0){
                System.out.println("a+b=" + (a+b));
            }
    }
//        【课后自己练】定义两个变量 int，判断二者的和，是否能被 3 又能被 5 整除，打印提示信息
        int num1 = 7;
        int num2 = 8;
        int sum = num1 + num2;
        if (sum % 3 == 0 && sum % 5 == 0){
            System.out.println("可以");
        }
        else {
            System.out.println("no");
        }
//        判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
//        (1)年份能被 4 整除，但不能被 100 整除；(2)能被 400
//          整除
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = myScanner.nextInt();
//        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
                if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
                    System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


}
}
