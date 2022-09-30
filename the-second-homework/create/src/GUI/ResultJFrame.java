package GUI;

import javax.swing.*;

public class ResultJFrame extends JFrame {
    public ResultJFrame(){
        initJFrame();

    }

    private void initJFrame() {
        //页面大小
        this.setSize(600,400);
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
