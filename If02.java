package control;
import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("����������");
        int age = myScanner.nextInt();
        if (age > 18){
            System.out.println("����18�꣬���ܳͷ�");
        }
        else {
            System.out.println("δ��18�꣬�´�ע��");
        }
    }
}
