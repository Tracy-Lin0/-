package until;

public class HammingUtils {
    /**
     * 传出两个字符串，计算他们的海明距离
     *
     * @param s1
     * @param s2
     * @return 海明距离
     */
    public static int getHammingDistance(String s1, String s2) {
        /*int distance = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                distance++;
            }
        }
        return distance;*/
        int distance = 0;
        if (s1.length() != s2.length()) {
            // 出错，返回-1
            distance = -1;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                // 每一位进行比较
                if (s1.charAt(i) != s2.charAt(i)) {
                    distance++;
                }
            }
        }
        return distance;
    }

    /**
     * 输出相似度
     * @param s1
     * @param s2
     * @return
     */
    public static double getSimilarity(String s1, String s2) {
        int distance = getHammingDistance(s1, s2);
        double similarity = 0.01 * (100 - (double)distance * 100 / 128);
        return similarity;
    }
}
