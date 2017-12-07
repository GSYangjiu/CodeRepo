package gof23.factory.abstractFactory;

import gof23.factory.abstractFactory.engine.Engine;
import gof23.factory.abstractFactory.engine.LowEngine;
import gof23.factory.abstractFactory.seat.LowSeat;
import gof23.factory.abstractFactory.seat.Seat;
import gof23.factory.abstractFactory.tyre.LowTyre;
import gof23.factory.abstractFactory.tyre.Tyre;

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
