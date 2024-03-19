package cn.scikth.utils.sms;


public class MathUtils {

    /**
     * 返回一个4位随机数
     *
     * @return
     */
    public static String random() {
        int random = (int) ((Math.random() * 9 + 1) * 1000);
        return random + "";
    }


}
