package control;
import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if (age > 18){
            System.out.println("已满18岁，接受惩罚");
        }
        else {
            System.out.println("未满18岁，下次注意");
        }
    }
}
