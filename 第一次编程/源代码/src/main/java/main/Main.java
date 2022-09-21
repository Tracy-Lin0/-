package main;

import until.HammingUtils;
import until.SimHashUtils;
import until.TxtUtils;

public class Main {
    public static void main(String[] args) {

        String str0 = TxtUtils.readTxt(args[0]);
        String str1 = TxtUtils.readTxt(args[1]);
        String resultFileName = args[2];
        //获取simHash码
        String simHash0 = SimHashUtils.getSimHash(str0);
        String simHash1 = SimHashUtils.getSimHash(str1);
        //相似度
        double similarity = HammingUtils.getSimilarity(simHash0, simHash1);
        /*StringBuilder builder = new StringBuilder();
        builder.append("原文文件：").append(path1).append("\n");
        builder.append("抄袭文件：").append(path2).append("\n");
        builder.append("两个文件的相似度为：").append(similarity).append("\n");
        TxtUtils.write(targetFile,builder.toString());*/

        // 把相似度写入最后的结果文件中
        TxtUtils.writeTxt(similarity, resultFileName);
        // 退出程序
        System.exit(0);
    }

}

