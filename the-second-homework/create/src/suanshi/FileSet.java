package suanshi;
import java.io.*;

public class FileSet  {
    //int num = 10;
    //char t[];
    public void Print(String name,String[]wenben,int num) throws Exception{
//        System.out.println(result);
        File file = new File(".\\" + File.separator + name+".txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer out = new FileWriter(file);
        for (int i=0;i<num;i++)
        {
            //out.write(t[i].QuiZ);
            String jieguo = String.valueOf(wenben[i]);
            System.out.println(jieguo);
            out.write(jieguo);
            out.write("\r\n");
        }
        out.close();
        //JOptionPane.showMessageDialog(this, "打印成功,文件保存至E:java");
    }

}

