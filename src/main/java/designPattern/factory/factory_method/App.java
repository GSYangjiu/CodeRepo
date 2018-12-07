package designPattern.factory.factory_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-31 11:13
 * Description:
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    private final Blacksmith blacksmith;

    public App(Blacksmith blacksmitch) {
        this.blacksmith = blacksmitch;
    }

    public static void main(String[] args) {
        App app = new App(new OrcBlacksmith());
        app.manufactureWeapons();

        app = new App(new ElfBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons() {
        Weapon weapon;
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(weapon.toString());
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(weapon.toString());
    }
}
