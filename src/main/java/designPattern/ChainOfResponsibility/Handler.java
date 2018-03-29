package designPattern.ChainOfResponsibility;

/**
 * Created by: Yang
 * Date: 2018-03-28
 * Time: 21:52
 * Description: 责任链模式
 */
public interface Handler {
    public abstract void handleRequest(String number);

    public abstract void setNextHandler(Handler handler);
}
