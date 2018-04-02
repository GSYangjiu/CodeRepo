package designPattern.adapter;

/**
 * Created by Yang on 2017/12/12 0012.
 */
public class Application {
    public static void main(String[] args) {
        DBSocketInterface dbSocket = new DBSocket();
        Hotel hotel = new Hotel(dbSocket);

        hotel.charge();

        GBSocketInterface gbSocket = new GBSocket();
        DBSocketInterface socketAdapter = new SocketAdapter(gbSocket);
        Hotel hotel1 = new Hotel(socketAdapter);
        hotel1.charge();
    }
}
