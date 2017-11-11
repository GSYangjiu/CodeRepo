package suanfa;

/**
 * Created by Yang on 2017/11/9 0009.
 */
public class MN {
    public static String str = "";
    public static void main(String[] args) {
        printMN(4,2);
    }

    public static void printMN(int m,int n){
        if(str.length()>=m){
            System.out.println(str);
        }else {
            str = str + n;
            printMN(m,n);
        }
    }
}
