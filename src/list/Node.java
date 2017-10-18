package list;

/**
 * Created by Yang on 2017/10/18.
 */
public class Node {
    Node previous;
    Object obj;
    Node next;

    public Node(){

    }

    public Node(Node previous, Object obj, Node next) {
        super();
        this.previous = previous;
        this.obj = obj;
        this.next = next;
    }
}
