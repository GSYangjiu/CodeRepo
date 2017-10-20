package utils.http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Yang on 2017/9/15 0015.
 */
public class test {
    private static String account = "muguangtest";
    private static String privateKey = "8dd8d6a1f0e16715";
    private static String url = "https://tapi.ccxcredit.com";

    public static void main(String[] args) {
        //demo
        String name = "杨浩环";
        String cid = "420983199606079016";
        String result = checkInfo(name,cid);
        System.out.println(result);
    }

    public static String checkInfo(String name, String cid) {
        String str = "account" + account + "cid" + cid + "name" + name + privateKey;
        String md5String = MD5Util.MD5(str).toUpperCase();
        String paramStr = null;
        try {
            paramStr = "account="+account+"&name="+ URLEncoder.encode(name,"utf8")+"&cid="+cid+"&sign="+md5String;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return HttpRequestUtil.sendGet(url,paramStr);
    }
}
