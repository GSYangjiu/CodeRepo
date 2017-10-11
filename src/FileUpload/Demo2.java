package FileUpload;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


/**
 * Created by Administrator on 2017/8/16 0016.
 */
public class Demo2 {
    public static String addMaterialEverInter(File file,String type) throws Exception {
        String accessToken="hSS1hWIigFyYmcYp267F2LQQOeJhrb-nF9bQT3ZSRc8b0HgF5ZJzHq9iBOT2vFjKykcV5ahq3HkysXIZtuO7vI4_GfYCiRuy3phqNYtqkDzUmgiRe-2xClLPGFA88I4eKBRbAGAQHX";
//        try {
//            accessToken=AccessTokenUtil.getTBS_AccessToken();
//        } catch (Exception e) {
//            e.printStackTrace();
//        };
        //上传素材
        String path="https://api.weixin.qq.com/cgi-bin/material/add_material?access_token="+accessToken+"&type="+type;
        String result =null;
        URL realUrl = new URL(path);

        URLConnection con= realUrl.openConnection();
        con.setDoInput(true);
        con.setDoOutput(true);
        con.setUseCaches(false); // post方式不能使用缓存
        // 设置请求头信息
        con.setRequestProperty("Connection", "Keep-Alive");
        con.setRequestProperty("Charset", "UTF-8");
        // 设置边界
        String BOUNDARY = "----------" + System.currentTimeMillis();
        con.setRequestProperty("Content-Type",
                "multipart/form-data; boundary="
                        + BOUNDARY);

        // 请求正文信息
        // 第一部分：
        StringBuilder sb = new StringBuilder();
        sb.append("--"); // 必须多两道线
        sb.append(BOUNDARY);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data;name=\"media\";filelength=\""+file.length()+"\";filename=\""
                + file.getName() + "\"\r\n");
        sb.append("Content-Type:application/octet-stream\r\n\r\n");
        byte[] head = sb.toString().getBytes("utf-8");
        // 获得输出流
        OutputStream out = new DataOutputStream(con.getOutputStream());
        // 输出表头
        out.write(head);
        // 文件正文部分
        // 把文件已流文件的方式 推入到url中
        DataInputStream in = new DataInputStream(new FileInputStream(file));
        int bytes = 0;
        byte[] bufferOut = new byte[1024];
        while ((bytes = in.read(bufferOut)) != -1) {
            out.write(bufferOut, 0, bytes);
        }
        in.close();
        // 结尾部分
        byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线
        out.write(foot);
        out.flush();
        out.close();
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = null;
        try {
            // 定义BufferedReader输入流来读取URL的响应
            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            if (result == null) {
                result = buffer.toString();
            }
        } catch (IOException e) {
            System.out.println("发送POST请求出现异常！" + e);
            e.printStackTrace();
            throw new IOException("数据读取异常");
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //String access_token = "hSS1hWIigFyYmcYp267F2LQQOeJhrb-nF9bQT3ZSRc8b0HgF5ZJzHq9iBOT2vFjKykcV5ahq3HkysXIZtuO7vI4_GfYCiRuy3phqNYtqkDzUmgiRe-2xClLPGFA88I4eKBRbAGAQHX";
        //String url = "https://api.weixin.qq.com/cgi-bin/material/add_material?access_token="+access_token+"&type=imgae";
        String result = null;
        File file = new File("C:\\Users\\Administrator\\Desktop\\Yang\\test.jpg");
        try {
            result = addMaterialEverInter(file,"image");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
