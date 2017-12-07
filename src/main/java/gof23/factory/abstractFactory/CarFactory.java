package gof23.factory.abstractFactory;

import gof23.factory.abstractFactory.engine.Engine;
import gof23.factory.abstractFactory.seat.Seat;
import gof23.factory.abstractFactory.tyre.Tyre;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
