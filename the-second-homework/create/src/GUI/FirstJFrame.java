package GUI;

import javax.swing.*;

public class FirstJFrame extends JFrame {
    //载入页面,开始界面

    public FirstJFrame(){
        //基础设置
        initFrame();

        //开始测试按钮
        //创建一个按钮
        JButton StartButton = new JButton("开始测试");
        //设置按钮的尺寸
        StartButton.setBounds(250,150,100,50);
        //给按钮添加一个监听
        StartButton.addActionListener(new MyActionListener());
        //将该按钮添加到窗口里
        this.getContentPane().add(StartButton);


//        //创建按钮的整个对象
//        JMenuBar StartBar = new JMenuBar();
//        //创建按钮上的选项



        //this.pack();
        //窗口可见,最好写在最后
        this.setVisible(true);

    }

    private void initFrame() {
        //页面大小
        this.setSize(600,400);
        //窗口标题
        this.setTitle("小学四则运算自动生成器 v1.0");
        //窗口居中
        this.setLocationRelativeTo(null);
        //关闭方式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //
        this.setLayout(null);
    }
}
