package suanshi;
import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileSet {
    int num = 10;
    //char t[];
    public void Print(int[] result) throws Exception{
//        System.out.println(result);
        File file = new File("E:" + File.separator + "JAVA" + File.separator + "Arithmetic_QuiZ.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer out = new FileWriter(file);
        for (int i=0;i<num;i++)
        {
            //out.write(t[i].QuiZ);
            String jieguo = String.valueOf(result[i]);
            System.out.println(result[i]);

            out.write(jieguo);
            out.write("\r\n");
        }
        out.close();
        //JOptionPane.showMessageDialog(this, "打印成功,文件保存至E:java");
    }

}

