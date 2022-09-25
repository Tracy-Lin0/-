package suanshi;

import java.util.Random;

public class suanshi {
    //声明区

        Random r = new Random();

        //随机运算类型，+、-、×、÷，四类
        //随机数从四者中抽取，不同类型不同函数
        //注意除法不取随机数相除，直接写乘法反过来，避免小数和分数


        //定义变量
        int kind = r.nextInt(4);//不同的运算类型0~3，0：加法，1：减法，2：乘法；3：除法
        int num0_1 = r.nextInt(100);//加法中取0~99
        int num0_2 = r.nextInt(100);//加法中取0~99
        int num0_3 = r.nextInt(100);//加法中取0~99
        int num1_1 = r.nextInt(75) + 25;//减法中最大的被减数取75~99
        int num1_2 = r.nextInt(25) + 25;//减法中第一个减数取25~49
        int num1_3 = r.nextInt(25);//减法中第二个减数取0~24
        int num2_1 = r.nextInt(9) + 1;//乘除法取1~10
        int num2_2 = r.nextInt(9) + 1;//乘除法取1~10
        //int[] result = new int[50];

//    //各种函数
//    public void aors() {//减法
//
//    }
//    public void mul() {//乘法
//
//    }
//    public void div() {//除法
//
//    }

}
