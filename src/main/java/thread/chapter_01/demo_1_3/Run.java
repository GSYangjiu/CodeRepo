package thread.chapter_01.demo_1_3;

/**
 * Created by Marik on 2018/3/28 0028.
 */

/*
    this.getName(); 实例获取线程name，c只是继承Thread类实现了Runnable接口的run()方法
    自身并没有执行，只是实例化了对象c交由线程t1执行，所以输出

    CountOperate---begin
    Thread.current().getName()=main
    this.getName()=Thread-0
    CountOperate---end

    run---begin
    Thread.current().getName()=A
    this.getName()=Thread-0
    run---end
    */
public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }
}
