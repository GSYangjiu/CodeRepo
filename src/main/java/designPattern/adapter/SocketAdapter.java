package designPattern.adapter;

/**
 * Created by Yang on 2017/12/12 0012.
 */
public class SocketAdapter implements DBSocketInterface {

    private GBSocketInterface gbSocket;

    public SocketAdapter() {

    }

    public SocketAdapter(GBSocketInterface gbSocket) {
        this.gbSocket = gbSocket;
    }

    @Override
    public void powerWithTwoRound() {
        gbSocket.powerWithThreeFlat();
    }
}
