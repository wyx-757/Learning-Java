package control;
//循环变量初始化;
//  do{
//  循环体(语句);
//  循环变量迭代;
//  }while(循环条件);
public class DoWhile01 {
    public static void main(String[] args) {
        int i = 1;//循环变量初始化
        do {
            System.out.println("hello" + i);//执行循环语句
            i++;//循环变量迭代
        }while (i <= 10);
        System.out.println("quit");

    }
}
