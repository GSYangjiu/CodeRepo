package Hanoi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

/**
 * Created by Yang on 2018/1/18 0018.
 */
public class Hanoi {
    static int count = 0;

    public static void main(String[] args) throws Exception {
        int n;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入盘数：");
        n = Integer.parseInt(buf.readLine());
        Hanoi hanoi = new Hanoi();
        hanoi.move(n, 'A', 'B', 'C');
        System.out.println("操作数：" + count);
    }

    public void move(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
        } else {
            move(n - 1, a, c, b);
            System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
            move(n - 1, b, a, c);
        }
        count++;
    }
}
