package collection.list;

/**
 * Created by Yang on 2017/10/18.
 */
public class SxtLinkList {
    private Node first;//头结点
    private Node last;//尾节点
    private int size;

    public int size() {
        return size;
    }

    public void add(Object o) {
        Node newNode = new Node();

        if (first != null) {
            newNode.previous = last;
            newNode.obj = o;
            last.next = newNode;
            last = newNode;
        } else {
            newNode.obj = o;
            first = newNode;
            last = newNode;
        }
        size++;
    }

    public void add(int index, Object o) {
        Node newNode = new Node();
        newNode.obj = o;
        Node temp = node(index);
        if (temp!=null){
            Node up = temp.previous;
            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;
            size++;
        }
    }

    public void remove(int index) {
        rangeCheck(index);
        Node temp = node(index);
        if (temp!=null){
            Node up = temp.previous;
            Node down = temp.next;
            if(up!=null){
                up.next = down;
            }
            if(down!=null){
                down.previous = up;
            }
            size--;
        }
    }

    public Object get(int index) {
        rangeCheck(index);
        Node temp = node(index);
        return temp != null ? temp.obj : null;
    }

    //索引检查
    public void rangeCheck(int l) {
        if (l < 0 || l >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //获取索引位置节点
    private Node node(int index) {
        Node temp = null;
        if (first != null) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }
}
