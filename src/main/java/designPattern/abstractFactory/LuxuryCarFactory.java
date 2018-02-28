package designPattern.abstractFactory;

import designPattern.abstractFactory.engine.Engine;
import designPattern.abstractFactory.engine.LuxuryEngine;
import designPattern.abstractFactory.seat.LuxurySeat;
import designPattern.abstractFactory.seat.Seat;
import designPattern.abstractFactory.tyre.LuxuryTyre;
import designPattern.abstractFactory.tyre.Tyre;

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
