package designPattern.ChainOfResponsibility;

import java.util.ArrayList;

/**
 * Created by: Yang
 * Date: 2018-03-28
 * Time: 21:54
 */
public class Beijing implements Handler {
    private Handler handler;                      //存放当前矗立着后继的Hander接口变量
    private ArrayList<String> numberList;         //存放身份证号码的数组线性表

    Beijing() {
        numberList = new ArrayList<String>();
        numberList.add("11129812340930034");
        numberList.add("10120810340930632");
        numberList.add("22029812340930034");
        numberList.add("32620810340930632");
    }

    @Override
    public void handleRequest(String number) {
        if (numberList.contains(number)) {
            System.out.println("该人在北京居住");
        } else {
            System.out.println("该人不在北京居住");
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
