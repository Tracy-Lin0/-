package Main;

import until.HammingUtils;
import until.SimHashUtils;
import until.TxtUtils;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TxtUtils.readTxt("E:/test/orig.txt");
        str[1] = TxtUtils.readTxt("E:/test/orig_0.8_add.txt");
        str[2] = TxtUtils.readTxt("E:/test/orig_0.8_del.txt");
        str[3] = TxtUtils.readTxt("E:/test/orig_0.8_dis_1.txt");
        str[4] = TxtUtils.readTxt("E:/test/orig_0.8_dis_10.txt");
        str[5] = TxtUtils.readTxt("E:/test/orig_0.8_dis_15.txt");
        String ansFileName = "E:/test/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TxtUtils.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = TxtUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtUtils.readTxt("E:/test/orig.txt");
        String ansFileName = "E:/test/result.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = TxtUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtUtils.readTxt("E:/test/orig_0.8_add.txt");
        String ansFileName = "E:/test/result.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = TxtUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtUtils.readTxt("E:/test/orig_0.8_add.txt");
        String ansFileName = "E:/test/result.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = TxtUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtUtils.readTxt("E:/test/orig_0.8_dis_1.txt");
        String ansFileName = "E:/test/result.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = TxtUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtUtils.readTxt("E:/test/orig_0.8_dis_10.txt");
        String ansFileName = "E:/test/result.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtUtils.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = TxtUtils.readTxt("E:/test/orig.txt");
        String str1 = TxtUtils.readTxt("E:/test/orig_0.8_dis_15.txt");
        String ansFileName = "E:/test/result.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtUtils.writeTxt(ans,ansFileName);
    }

}
