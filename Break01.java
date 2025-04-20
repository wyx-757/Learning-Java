package control;
//break 语句用于终止某个语句块的执行，一般使用在 switch 或者循环[for , while , do-while]中
public class Break01 {
    public static void main(String[] args) {
        for (int i = 0;i < 10;i++){
            if (i == 7){
                break;
            }
            System.out.println("ok" + i);
        }

    }
}
