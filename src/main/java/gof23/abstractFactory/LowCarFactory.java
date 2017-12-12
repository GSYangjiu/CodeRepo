package gof23.abstractFactory;

import gof23.abstractFactory.engine.Engine;
import gof23.abstractFactory.engine.LowEngine;
import gof23.abstractFactory.seat.LowSeat;
import gof23.abstractFactory.seat.Seat;
import gof23.abstractFactory.tyre.LowTyre;
import gof23.abstractFactory.tyre.Tyre;

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
