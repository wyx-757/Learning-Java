package control;

public class DoWhileExercise01 {
    public static void main(String[] args) {
//��ӡ 1��100 [ѧ����]
//���� 1��100 �ĺ� [ѧ����]
//ͳ�� 1---200 ֮���ܱ� 5 ���������ܱ� 3 �����ĸ��� (DoWhileExercise01.java)
        int i = 1;//��ʼ��
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
