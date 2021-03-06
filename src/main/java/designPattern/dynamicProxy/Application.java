package designPattern.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-03 14:40
 * description:
 */
public class Application {
    public static void main(String[] args) {
        //委托类
        Vendor vendor = new Vendor();
        //中介类
        DynamicProxy inter = new DynamicProxy(vendor);
        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //获取代理类实例
        Sell sell = (Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class}, inter));
        //通过代理类对象调用代理类方法，实际上会转到invoke方法调用
        sell.sell();
        sell.ad();
    }
}