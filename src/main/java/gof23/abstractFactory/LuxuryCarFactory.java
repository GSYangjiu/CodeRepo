package gof23.abstractFactory;

import gof23.abstractFactory.engine.Engine;
import gof23.abstractFactory.engine.LuxuryEngine;
import gof23.abstractFactory.seat.LuxurySeat;
import gof23.abstractFactory.seat.Seat;
import gof23.abstractFactory.tyre.LuxuryTyre;
import gof23.abstractFactory.tyre.Tyre;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
