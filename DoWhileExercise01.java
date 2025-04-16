package control;

public class DoWhileExercise01 {
    public static void main(String[] args) {
//打印 1—100 [学生做]
//计算 1—100 的和 [学生做]
//统计 1---200 之间能被 5 整除但不能被 3 整除的个数 (DoWhileExercise01.java)
        int i = 1;//初始化
        int sum = 0;
        do {
            System.out.println(i);
            i++;
            sum += i;

        } while (i <= 100);
        System.out.println(sum);

        int p = 1;
        int count = 0;
        do {
            if (p % 5 == 0 && p % 3 !=0) {
                System.out.println(p);
                count++;
            }
            p++;
        } while (p <= 200);
        System.out.println(count);
    }
}
