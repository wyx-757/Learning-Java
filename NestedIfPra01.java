package control;
import java.util.Scanner;

public class NestedIfPra01 {
    public static void main(String[] args) {
        /*出票系统，根据淡季旺季的月份和年龄，打印票价
        * 4 - 10 旺季
        * 成人（18-60）：60
        * 儿童（<18），半价
        * 老人(>60) 三分之一
        * 淡季
        * 成人40，其他20*/
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner.nextInt();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if (month >= 4 && month<= 10){
            if (age >= 18 && age<= 60){
                System.out.println("票价60");
            } else if (age <= 18) {
                System.out.println("票价30");
            }else {
                System.out.println("票价20");
            }
        }else {
            if (age >= 18 && age<= 60){
                System.out.println("票价40");
            }else {
                System.out.println("票价20");
            }
        }
    }
}
