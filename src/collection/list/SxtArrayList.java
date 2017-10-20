package collection.list;

/**
 * Created by Yang on 2017/10/17.
 */
public class SxtArrayList {
    private Object[] sort;

    private int size;

    //构造函数
    public SxtArrayList() {
        this(10);
    }

    public SxtArrayList(int size) {
        if (size < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.sort = new Object[size];
    }

    //数组扩容
    public void ensureCapacity() {
        if (size == sort.length) {
            Object[] newArray = new Object[2 * size + 1];
            System.arraycopy(sort, 0, newArray, 0, sort.length);
            sort = newArray;
        }
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

    //add方法
    public void add(Object o) {
        ensureCapacity();
        sort[size++] = o;
    }

    //指定位置add方法
    public void add(Object o, int index) {
        rangeCheck(index);
        ensureCapacity();
        System.arraycopy(sort, index, sort, index + 1, size - index);
        sort[index] = o;
        size++;
    }

    //get方法
    public Object get(int index) {
        rangeCheck(index);
        return sort[index];
    }

    //set方法
    //set方法返回的是被取代的元素，这点很有意思
    public Object set(Object o, int index) {
        rangeCheck(index);
        Object oldValue = sort[index];
        sort[index] = o;
        return oldValue;
    }

    //remove方法
    public Object remove(int index) {
        rangeCheck(index);
        Object oldValue = sort[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(sort, index, sort, index - 1, size - index);
        }
        sort[--size] = null;
        return oldValue;
    }

    //remove某个元素方法
    public boolean remove(Object o) {
        if(o==null){
            for (int index = 0; index < size; index++) {
                if (sort[index] == null) {
                    remove(index);
                    return true;
                }
            }
        }else {
            for (int index = 0; index < size; index++) {
                if (sort[index].equals(o)) {
                    remove(index);
                    return true;
                }
            }
        }
        return false;
    }

    //size方法
    public int size() {
        return size;
    }

    //isEmpty方法
    public boolean isEmpty() {
        return size == 0;
    }
}
