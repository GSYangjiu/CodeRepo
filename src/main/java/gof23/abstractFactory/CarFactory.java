package gof23.abstractFactory;

import gof23.abstractFactory.engine.Engine;
import gof23.abstractFactory.seat.Seat;
import gof23.abstractFactory.tyre.Tyre;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
