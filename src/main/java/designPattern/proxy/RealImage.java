package designPattern.proxy;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 10:59
 * Description:
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Dispalying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loding " + fileName);
    }
}
