package control;
//1) ѭ�������Ƿ���һ������ֵ�ı��ʽ
//2) while ѭ�������ж���ִ�����

//1) ��ӡ 1��100 ֮�������ܱ� 3 �������� [ʹ�� while, ��ʦ���� ]
//2) ��ӡ 40��200 ֮�����е�ż�� [ʹ�� while, �κ���ϰ]
//����
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
