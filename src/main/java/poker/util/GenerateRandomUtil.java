package poker.util;

import java.util.Random;

public class GenerateRandomUtil {

    /**
     * 生成固定长度的随机字符
     *
     * @param len
     * @return
     */
    public static String generateRandomChar(Integer len) {
        // 生成字母A-Z,a-z 之间的随机字符 

        StringBuffer sb = new StringBuffer();
        for (Integer i = 0; i < len; i++) {
            int intRand = (int) (Math.random() * 52);
            char base = (intRand < 26) ? 'A' : 'a';
            char c = (char) (base + intRand % 26);
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * 生成固定长度的随机字符和数字
     *
     * @param len
     * @return
     */
    public static String generateRandomCharAndNumber(Integer len) {
        StringBuffer sb = new StringBuffer();
        for (Integer i = 0; i < len; i++) {
            int intRand = (int) (Math.random() * 52);
            int numValue = (int) (Math.random() * 10);
            char base = (intRand < 26) ? 'A' : 'a';
            char c = (char) (base + intRand % 26);
            if (numValue % 2 == 0) {
                sb.append(c);
            } else {
                sb.append(numValue);
            }
        }
        return sb.toString();
    }

    /**
     * 生成随机长度的Integer
     *
     * @param len
     * @return
     */
    public static Integer generateRandomInt(Integer len) {
        StringBuffer sb = new StringBuffer();
        for (Integer i = 0; i < len; i++) {
            int numValue = (int) (Math.random() * 10);
            sb.append(numValue);
        }
        return Integer.valueOf(sb.toString());
    }

    /**
     * 生成随机长度的Long
     *
     * @param len
     * @return
     */
    public static Long generateRandomLong(Integer len) {
        StringBuffer sb = new StringBuffer();
        for (Integer i = 0; i < len; i++) {
            int numValue = (int) (Math.random() * 10);
            sb.append(numValue);
        }
        return Long.valueOf(sb.toString());
    }

    public static String getCharAndNumr(Integer length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; // 输出字母还是数字 
            if ("char".equalsIgnoreCase(charOrNum)) {// 字符串
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母 
                sb.append((char) (choice + random.nextInt(26)));
            } else if ("num".equalsIgnoreCase(charOrNum)) {// 数字
                sb.append(String.valueOf(random.nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(generateRandomChar(100)); 
        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomCharAndNumber(20));
        }

    }
}