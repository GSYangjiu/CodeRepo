package collection;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-04-02 16:22
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Node node = new Node();
        add(node);
        System.out.println(node.getX());
    }

    public static void add(Node x) {
        x.setX(100);
    }
}

class Node {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
