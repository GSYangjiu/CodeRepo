package gof23.factory.abstractFactory.engine;

import gof23.factory.abstractFactory.engine.Engine;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转速慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢！");
    }
}
