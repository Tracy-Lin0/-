package GUI;

import javax.swing.*;
import java.awt.*;

public class SuanshiJFrame extends JFrame {
    public SuanshiJFrame(){
        initJFrame();
//        //创建文本框answer
//        TextArea answer = new TextArea(5,20);
//        //创建aBox
//        //Box aBox = Box.createHorizontalBox();
//        //this.add(aBox,BorderLayout.NORTH);
//        //创建盒子top
//        Box top = Box.createVerticalBox();
//        //将文本框answer添加进盒子top
//        top.add(answer);
//        //添加top盒子到窗口
//        this.add(top);
//        for(int i = 0;i < 10;i++) {
//
//            TextField answer = new TextField(5);
//        }
        TextField answer1 = new TextField(5);
        TextField answer2 = new TextField(5);
        TextField answer3 = new TextField(5);
        TextField answer4 = new TextField(5);
        TextField answer5 = new TextField(5);
        TextField answer6 = new TextField(5);
        TextField answer7 = new TextField(5);
        TextField answer8 = new TextField(5);
        TextField answer9 = new TextField(5);
        TextField answer10 = new TextField(5);
        Button ok = new Button("确认");
        this.pack();
    }

    private void initJFrame() {
        //页面大小(暂不设置，使用适配设置根据填充内容自动设置）
        //this.setSize(600,400);
        //窗口标题
        this.setTitle("小学四则运算自动生成器 v1.0");
        //窗口居中
        this.setLocationRelativeTo(null);
        //关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //窗口可见
        this.setVisible(true);
    }
}
