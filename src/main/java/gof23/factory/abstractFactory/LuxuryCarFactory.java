package gof23.factory.abstractFactory;

import gof23.factory.abstractFactory.engine.Engine;
import gof23.factory.abstractFactory.engine.LuxuryEngine;
import gof23.factory.abstractFactory.seat.LuxurySeat;
import gof23.factory.abstractFactory.seat.Seat;
import gof23.factory.abstractFactory.tyre.LuxuryTyre;
import gof23.factory.abstractFactory.tyre.Tyre;

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
