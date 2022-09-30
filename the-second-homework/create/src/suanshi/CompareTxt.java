package suanshi;
import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class CompareTxt {

    public static void compareTwoFile(String daanFile, String huidaFile) throws IOException {

        File fileDaan = new File(daanFile);
        File fileHuida = new File(huidaFile);
        ArrayList wrong1 = new ArrayList();
        ArrayList right1 = new ArrayList();
        int a = 0;//计错题数
        int b = 0;//计算对题


        FileInputStream inputStream1 = new FileInputStream(fileDaan);
        int size1 = inputStream1.available();
        byte[] buffer1 = new byte[size1];
        inputStream1.read(buffer1);
        inputStream1.close();
        String fileDaanStr = new String(buffer1, "GBK");

        FileInputStream inputStream2 = new FileInputStream(fileHuida);
        int size2 = inputStream2.available();
        byte[] buffer2 = new byte[size2];
        inputStream2.read(buffer2);
        inputStream2.close();
        String fileHuidaStr = new String(buffer2, "GBK");

        if (fileHuidaStr.equals(fileDaanStr)){
            System.out.println("全对了！");
            return;
        }

        String[] daanSplit = fileDaanStr.split("\n");
        String[] huidaSplit = fileHuidaStr.split("\n");

        //BufferedWriter bufferedWriter = null;
        //bufferedWriter = new BufferedWriter(new FileWriter(".\\jieguo.txt"));//在指定位置创建文件
        PrintStream ps = new PrintStream(".\\jieguo.txt");

        if (huidaSplit != null && daanSplit != null) {
            //答案
            System.out.println("================正确答案===================");
            for (int i = 0; i < daanSplit.length; i++) {
                if (!daanSplit[i].equals(huidaSplit[i])) {
                    System.out.println(i+1 + "、" + daanSplit[i]);
                    wrong1.add(i+1);
                    a++;
                }
            }

            //答卷
            System.out.println("================错题===================");
            for (int i = 0; i < huidaSplit.length; i++) {
                if (i < daanSplit.length) {
                    if (!huidaSplit[i].equals(daanSplit[i])) {
                        System.out.println( i+1 + "、" + huidaSplit[i]);
                    }
                } else {
                    System.out.println(i+1 + "、" + huidaSplit[i]);
                    b++;
                    right1.add(i);
                }
            }
        }
        System.setOut(ps);
        System.out.println("================结果===================");
        System.out.println("错题数："+ a);
        System.out.println("题号:"+ wrong1);
        System.out.println("对题数"+b);
        System.out.println("题号:"+right1);
        ps.close();

    }
}
