package jiami;

/**
 * Created by Yang on 2017/9/21 0021.
 */
public class Test {
    public static void main(String[] args) {
        /*String a ="杨浩环";
        String b ="杨浩环";
        MD5Util.*/
        /*身份证校验码的计算方法

        1、将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数分别为：7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2。

        2、将这17位数字和系数相乘的结果相加。

        3、用加出来和除以11，看余数是多少？

        4、余数只可能有0－1－2－3－4－5－6－7－8－9－10这11个数字。其分别对应的最后一位身份证的号码为1－0－X－9－8－7－6－5－4－3－2。

        5、通过上面得知如果余数是3，就会在身份证的第18位数字上出现的是9。如果对应的数字是10，身份证的最后一位号码就是罗马数字x。

        例如：某男性的身份证号码为【53010219200508011x】， 我们看看这个身份证是不是合法的身份证。*/
        //5  1   0  7  2  4  1  9  9  5              2  4 2 X
        //7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2。
        int l;
        int z=0;
        String begin = "5107241995";
        String end = "242X";
        l = 25 + 9 + 36 + 16 + 16 + 2 + 9 + 54 + 15 + 16 + 16 + 2;
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 10; y++) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        if((l+7*x+9*y+10*i+5*j)%11==2){
                            if(x==0&&y==0){
                                break;
                            }
                            if(x==1&&y>2){
                                break;
                            }
                            if(i==3&&j>1){
                                break;
                            }
                            if(i==0&&j==0){
                                break;
                            }
                            z++;
                            System.out.println(begin+x+y+i+j+end);
                        }
                    }
                }
            }
        }
        System.out.println(z);
    }
}
