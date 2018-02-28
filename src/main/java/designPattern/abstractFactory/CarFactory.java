package designPattern.abstractFactory;

import designPattern.abstractFactory.engine.Engine;
import designPattern.abstractFactory.seat.Seat;
import designPattern.abstractFactory.tyre.Tyre;

/**
 * Created by Yang on 2017/12/7 0007.
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
