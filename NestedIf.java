/*
在一个分支结构中又完整的嵌套了另一个完整的分支结构，里面的分支的结构称为内层分支外面的分支结构称为外
层分支。老师建议: 不要超过 3 层 （可读性不好）
*/
package control;
import java.util.Scanner;


public class NestedIf {
    public static void main(String[] args) {
        /*
        参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组。
        输入成绩和性别，进行判断和输出信息。
        */
//1. 创建 Scanner 对象，接收用户输入
//2. 接收 成绩保存到 double score
//3. 使用 if-else 判断 如果初赛成绩大于 8.0 进入决赛，否则提示淘汰
//4. 如果进入到 决赛，再接收 char gender, 使用 if-else 输出信息
        Scanner myscannner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double grade = myscannner.nextDouble();
        //char gender = myscannner.next().charAt(0);
        if (grade > 8.0){
            System.out.println("请输入性别");
            char gender = myscannner.next().charAt(0);
            //一定要用比较运算符==
            if (gender == '男'){
                System.out.println("进入男子组");
            } else if (gender == '女') {
                System.out.println("进入女子组");
            }else {
                System.out.println("性别输入错误");
            }

        }else {
            System.out.println("淘汰");
        }

    }
}

