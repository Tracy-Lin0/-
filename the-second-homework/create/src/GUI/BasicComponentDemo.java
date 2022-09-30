package GUI;

import javax.swing.*;
import java.awt.*;

public class BasicComponentDemo {
    Frame frame = new Frame("这里测试基本组件");

    Label question1 = new Label("1 + 2 + 3 = ");
    Label question2 = new Label("2 + 2 + 3 = ");
    Label question3 = new Label("3 + 2 + 3 = ");
    Label question4 = new Label("4 + 2 + 3 = ");
    Label question5 = new Label("5 + 2 + 3 = ");
    Label question6 = new Label("6 + 2 + 3 = ");
    Label question7 = new Label("7 + 2 + 3 = ");
    Label question8 = new Label("8 + 2 + 3 = ");
    Label question9 = new Label("9 + 2 + 3 = ");
    Label question10 = new Label("10 + 2 + 3 = ");
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
//    TextField answer2 = new TextField(5);
//    TextField answer3 = new TextField(5);
//    TextField answer4 = new TextField(5);
//    TextField answer5 = new TextField(5);
//    TextField answer6 = new TextField(5);
//    TextField answer7 = new TextField(5);
//    TextField answer8 = new TextField(5);
//    TextField answer9 = new TextField(5);
//    TextField answer10 = new TextField(5);
    Button ok = new Button("确认");
//    TextArea ta = new TextArea(5,20);//文本域
//
//    Choice colorChooser = new Choice();//下拉选择框
//
//    CheckboxGroup cbg = new CheckboxGroup();
//    Checkbox male = new Checkbox("男",cbg,true);
//    Checkbox female = new Checkbox("女",cbg,false);
//
//    Checkbox isMarried = new Checkbox("是否已婚？");

//    TextField tf = new TextField(50);
//    Button ok = new Button("确认");

    //List colorList = new List(6,true);

    public void init(){
        //组装界面

        //组装底部
        Box Box1 = Box.createHorizontalBox();
        Box1.add(question1);
        Box1.add(answer1);

        Box Box2 = Box.createHorizontalBox();
        Box2.add(question2);
        Box2.add(answer2);

        Box Box3 = Box.createHorizontalBox();
        Box3.add(question3);
        Box3.add(answer3);

        Box Box4 = Box.createHorizontalBox();
        Box4.add(question4);
        Box4.add(answer4);

        Box Box5 = Box.createHorizontalBox();
        Box5.add(question5);
        Box5.add(answer5);

        Box Box6 = Box.createHorizontalBox();
        Box6.add(question6);
        Box6.add(answer6);

        Box Box7 = Box.createHorizontalBox();
        Box7.add(question7);
        Box7.add(answer7);

        Box Box8 = Box.createHorizontalBox();
        Box8.add(question8);
        Box8.add(answer8);

        Box Box9 = Box.createHorizontalBox();
        Box9.add(question9);
        Box9.add(answer9);

        Box Box10 = Box.createHorizontalBox();
        Box10.add(question10);
        Box10.add(answer10);

        Box Box_ok = Box.createHorizontalBox();
        Box_ok.add(ok);
//        Box1.add(ok);
        frame.add(Box1,BorderLayout.NORTH);
        frame.add(Box2,BorderLayout.AFTER_LINE_ENDS);
        frame.add(Box3,BorderLayout.AFTER_LINE_ENDS);
        frame.add(Box4,BorderLayout.AFTER_LINE_ENDS);
        frame.add(Box5,BorderLayout.AFTER_LAST_LINE);
        frame.add(Box6,BorderLayout.AFTER_LAST_LINE);
        frame.add(Box7,BorderLayout.AFTER_LAST_LINE);
        frame.add(Box8,BorderLayout.AFTER_LAST_LINE);
        frame.add(Box9,BorderLayout.AFTER_LAST_LINE);
        frame.add(Box10,BorderLayout.AFTER_LAST_LINE);


//        bBox.add(answer1);
//        bBox.add(answer2);
//        bBox.add(answer3);
//        bBox.add(answer4);
//        bBox.add(answer5);
//        bBox.add(answer6);
//        bBox.add(answer7);
//        bBox.add(answer8);
//        bBox.add(answer9);
//        bBox.add(answer10);
//        bBox.add(ok);

//        frame.add(bBox,BorderLayout.SOUTH);

        //组装 选择部分
//        colorChooser.add("红色");
//        colorChooser.add("蓝色");
//        colorChooser.add("绿色");
//
//        Box cBox = Box.createHorizontalBox();
//        cBox.add(colorChooser);
//        cBox.add(male);
//        cBox.add(female);
//        cBox.add(isMarried);
//
//        //组装文本域和选择部分
//        Box topLeft = Box.createVerticalBox();
//        topLeft.add(ta);
//        topLeft.add(cBox);

        //组装顶部左边和列表框
//        colorList.add("红色");
//        colorList.add("绿色");
//        colorList.add("蓝色");

        Box top = Box.createHorizontalBox();
        //top.add(topLeft);
//        top.add(colorList);

        frame.add(top);

        //设置frame为最佳大小，并且可见
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BasicComponentDemo().init();

    }
}