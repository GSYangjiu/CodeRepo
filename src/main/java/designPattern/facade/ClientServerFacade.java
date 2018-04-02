package designPattern.facade;

/**
 * Created by: Yang
 * Date: 2018-03-29
 * Time: 20:16
 */
public class ClientServerFacade {
    private CheckWord checkWord;
    private Charge charge;
    private TypeSeting typeSeting;
    String advertisement;

    public ClientServerFacade(String advertisement) {
        this.advertisement = advertisement;
        checkWord = new CheckWord(advertisement);
        charge = new Charge(checkWord);
        typeSeting = new TypeSeting(advertisement);
    }

    public void doAdvertisment() {
        checkWord.setChargeAmount();
        charge.giveCharge();
        typeSeting.typeSeting();
    }
}
