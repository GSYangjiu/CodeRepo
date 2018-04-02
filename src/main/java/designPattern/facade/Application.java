package designPattern.facade;

/**
 * Created by: Yang
 * Date: 2018-03-29
 * Time: 20:19
 */
public class Application {
    public static void main(String[] args) {
        ClientServerFacade clientServerFacade;
        String clientAdvertisement = "月光电脑，价格6356元，联系电话：1234567";
        clientServerFacade = new ClientServerFacade(clientAdvertisement);
        clientServerFacade.doAdvertisment();
    }
}
