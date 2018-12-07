package designPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Yang.
 * email : vincent1094259423@yahoo.com
 * date  : 2018-12-03 14:38
 * description:
 */
public class DynamicProxy implements InvocationHandler {
    // 代理对象
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(object, args);
        System.out.println("after");
        return result;
    }
}
