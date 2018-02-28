package designPattern.abstractFactory;

import designPattern.abstractFactory.engine.Engine;
import designPattern.abstractFactory.engine.LowEngine;
import designPattern.abstractFactory.seat.LowSeat;
import designPattern.abstractFactory.seat.Seat;
import designPattern.abstractFactory.tyre.LowTyre;
import designPattern.abstractFactory.tyre.Tyre;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
