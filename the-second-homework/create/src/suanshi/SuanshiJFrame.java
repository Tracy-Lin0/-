package suanshi;

import javax.swing.*;
import java.awt.*;

public class SuanshiJFrame extends JFrame {

    //设置三个组件：题目展示，答案输入，提交按钮
//    private Label QuestionArea;
//    private TextArea AnswerArea;
//    private JButton SubmitAnswers;




    public SuanshiJFrame(){
        //初始化设置窗口
//        initJFrame();
        setTitle("小学四则运算生成器");

        //窗口大小
        this.setSize(600,400);
        //窗口居中
        this.setLocationRelativeTo(null);
        //关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //窗口可见
        this.setVisible(true);


        //设置三个盒子存放不同的组件
        Box Box1 = Box.createHorizontalBox();
        Box Box2 = Box.createHorizontalBox();
        Box Box3 = Box.createHorizontalBox();


//        setLayout(new FlowLayout());

        //
        Label QuestionArea = new Label("1\n1\n1\n1\n1\n1\n1\n1\n1");
        TextArea AnswerArea = new TextArea();
        JButton SubmitAnswers = new JButton("提交答案");

        //三个盒子
        Box1.add(QuestionArea);
        Box2.add(AnswerArea);
        Box3.add(SubmitAnswers);
        this.add(Box1,BorderLayout.WEST);
        this.add(Box2,BorderLayout.EAST);
        this.add(Box3,BorderLayout.SOUTH);





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
//        TextField answer1 = new TextField(5);
//        TextField answer2 = new TextField(5);
//        TextField answer3 = new TextField(5);
//        TextField answer4 = new TextField(5);
//        TextField answer5 = new TextField(5);
//        TextField answer6 = new TextField(5);
//        TextField answer7 = new TextField(5);
//        TextField answer8 = new TextField(5);
//        TextField answer9 = new TextField(5);
//        TextField answer10 = new TextField(5);
//        Button ok = new Button("确认");
        //this.pack();
    }

//    private void initJFrame() {
//        //页面大小(暂不设置，使用适配设置根据填充内容自动设置）
//        this.setSize(600,400);
//        //窗口标题
//        this.setTitle("小学四则运算自动生成器 v1.0");
//        //窗口居中
//        this.setLocationRelativeTo(null);
//        //关闭方式
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        //窗口可见
//        this.setVisible(true);
//    }
}
