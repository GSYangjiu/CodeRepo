package gof23.adapter;

/**
 * Created by Yang on 2017/12/12 0012.
 */
public class Hotel {
    private DBSocketInterface dbSocket;

    public Hotel() {
    }

    public Hotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        dbSocket.powerWithTwoRound();
    }
}
