package io;

import java.io.*;

/**
 * Created by Yang on 2017/12/16 0016.
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(("C:\\Users\\Administrator\\Desktop\\Yang\\51072419950624242X.txt")));
            bw = new BufferedWriter(new FileWriter(("C:\\Users\\Administrator\\Desktop\\Yang\\51072419950624242.txt")));
            String str = null;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readStr() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text");
        System.out.println("Enter 'end' of text");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }

    public void readChara() throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下‘q’键退出。");
        //读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

    public void readFile() {
        int count = 0;
        InputStream streamReader = null;
        try {
            streamReader = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\Yang\\51072419950624242X.txt"));
            while (streamReader.read() != -1) {
                count++;
            }
            System.out.println("长度是" + count + "字节");
        } catch (final IOException e) {
            e.printStackTrace();
        } finally {
            try {
                streamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
