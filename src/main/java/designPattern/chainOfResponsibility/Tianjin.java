package designPattern.chainOfResponsibility;

import java.util.ArrayList;

/**
 * Created by: Yang
 * Date: 2018-03-28
 * Time: 21:54
 */
public class Tianjin implements Handler {
    private Handler handler;                      //存放当前矗立着后继的Hander接口变量
    private ArrayList<String> numberList;         //存放身份证号码的数组线性表

    Tianjin() {
        numberList = new ArrayList<String>();
        numberList.add("10039812340930034");
        numberList.add("20020910340430632");
        numberList.add("30029812340930034");
        numberList.add("50020810340930632");
    }

    @Override
    public void handleRequest(String number) {
        if (numberList.contains(number)) {
            System.out.println("该人在天津居住");
        } else {
            System.out.println("该人不在天津居住");
            if (handler != null) {
                handler.handleRequest(number);
            }
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
