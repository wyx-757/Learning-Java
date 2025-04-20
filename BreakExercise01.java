package control;
//1) 1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
public class BreakExercise01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            sum += i;
            if (sum > 20){
                System.out.println(i);
                break;
            }
        }
        System.out.println(sum);

    }
}
