package control;
//1) 1-100 ���ڵ�����ͣ���� ���� ��һ�δ��� 20 �ĵ�ǰ�� ��for + break��
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
