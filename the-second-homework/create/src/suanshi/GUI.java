package suanshi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GUI {

   // public static void main(String[] args) throws Exception {
//        //运行create_suanshi.java
//        int[] result = Create();
        //Create_suanshi();

        //new FirstJFrame();
        //new SuanshiJFrame();
        //new ResultJFrame();
    }

    /*private static void Create_suanshi() throws IOException {
        BufferedWriter bufferedWriter = null;
        bufferedWriter = new BufferedWriter(new FileWriter(".\\Qize.txt"));//在指定位置创建文件
        int[]result = new int[11];
        for (int i = 0; i <= 10; i++) {//生成10个算式
            suanshi s = new suanshi();
        /* 将输出流传进txt文件
        PrintStream ps = new PrintStream(".\\Qize.txt");
        //可能会出现异常，直接throws就行了
        System.setOut(ps);*/
    /*
            if (s.kind == 0) {//加法
                result[i]= s.num0_1 + s.num0_2 + s.num0_3;
                System.out.println(s.num0_1 + " + " + s.num0_2 + " + " + s.num0_3 + " = ");
                bufferedWriter.write(s.num0_1 + " + " + s.num0_2 + " + " + s.num0_3 + " = ");
                bufferedWriter.newLine();   //换行，上面写了提供的换行方法。
                //System.out.println(s.result + "\n");
            } else if (s.kind == 1) {//减法
                result[i] = s.num1_1 - s.num1_2 - s.num1_3;
                System.out.println(s.num1_1 + " - " + s.num1_2 + " - " + s.num1_3 + " = ");
                bufferedWriter.write(s.num1_1 + " - " + s.num1_2 + " - " + s.num1_3 + " = ");
                bufferedWriter.newLine();   //换行，上面写了提供的换行方法。
                //System.out.println(s.result + "\n");
            } else if (s.kind == 2) {//乘法
                result[i] = s.num2_1 * s.num2_2;
                System.out.println(s.num2_1 + " * " + s.num2_2 + " = ");
                bufferedWriter.write(s.num2_1 + " * " + s.num2_2 + " = ");
                bufferedWriter.newLine();   //换行，上面写了提供的换行方法。
                //System.out.println(s.result + "\n");
            } else if (s.kind == 3) {//除法
                result[i] = s.num2_1;
                System.out.println(s.num2_1 * s.num2_2 + " ÷ " + s.num2_2 + " = ");
                bufferedWriter.write(s.num2_1 * s.num2_2 + " ÷ " + s.num2_2 + " = ");
                bufferedWriter.newLine();   //换行，上面写了提供的换行方法。
                //System.out.println(s.result + "\n");
            }
        }
        bufferedWriter.close();  //关闭输入流
    }
}}*/
