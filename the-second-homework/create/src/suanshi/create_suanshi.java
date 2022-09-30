package suanshi;
import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Arrays;



public class create_suanshi {
    public static void main(String[] args) throws Exception {

        suanshi[] t = new suanshi[10000];//创建10000个实例

        /*输入参数*/
        Scanner scan = new Scanner(System.in);
        System.out.println("范围是xx以内的：");
        int max = scan.nextInt();
        System.out.println("确定生成符号类型：");
        System.out.println("加——1\n减——2\n乘——4\n除——8\n");
        System.out.println("如果需要多个运算符号混用请自行求和！");
        int style = scan.nextInt();
        System.out.println("输入生成多少个算式：");
        int num = scan.nextInt();


        String str ;
        String []quiz = new String[10000];//问题的字符串数组


        jisuan j = new jisuan();
        String[]Result = new String[10000];

        for (int i = 0; i < num; i++) {

            /*生成算式*/
            t[i] = new suanshi(max, style + 16);
            t[i].Creats();
            /*将算式存进字符串数组*/
            quiz[i] = t[i].QuiZ;

            /*计算结果*/
            str = quiz[i];
            str = str.substring(0, str.length()-1);
            System.out.println();
            Result[i] = j.test1(str);

            //System.out.printf("请按回车继续");//这里是为了空出时间写答案
            //System.in.read();
        }
        FileSet f = new FileSet();//创建文件放答案
        f.Print("Quiz",quiz,num);//传入算式进函数创建文件

        f.Print("daan",Result,num);//创建答案文件

        CompareTxt C = new CompareTxt();//调用——对比答案和作答
        C.compareTwoFile("daan.txt", "huida.txt");
    }
}
