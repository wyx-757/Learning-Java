package control;
import java.util.Scanner;
//ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,����"666"��ʾ��¼�ɹ���������ʾ���м��λ��ᣬ��ʹ�� for+break���
// 1. ���� Scanner ��������û�����
// 2. ���� String name ; String passwd; �����û���������
// 3. ���ѭ�� 3 ��[��¼ 3 ��]����� ������������ǰ�˳�
// 4. ����һ����� int chance ��¼���м��ε�¼����
public class BreakExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String password = "";
        int chance = 3;//��¼һ�μ���һ��
        for (int i = 1;i <= 3;i++){
            System.out.println("�����û���");
            name = myScanner.next();
            System.out.println("��������");
            password = myScanner.next();
            //�Ƚ���������ֺ������Ƿ���ȷ
            //����˵���ַ��� ������ �Ƚ� ʹ�õ� ���� equals
            if ("����".equals(name) && "666".equals(password)){
                System.out.println("��¼�ɹ�");
                break;
            }
            chance--;
            System.out.println("����" + chance + "�ε�¼����");
        }


    }
}
