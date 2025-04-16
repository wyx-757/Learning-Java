package control;
//1) 循环条件是返回一个布尔值的表达式
//2) while 循环是先判断再执行语句

//1) 打印 1—100 之间所有能被 3 整除的数 [使用 while, 老师评讲 ]
//2) 打印 40—200 之间所有的偶数 [使用 while, 课后练习]
//代码
public class WhileExercise {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            if (i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
        int d = 40;
        while (d <= 200){
            if (d % 2 == 0){
                System.out.println(d);
            }
            d++;
        }
    }
}
