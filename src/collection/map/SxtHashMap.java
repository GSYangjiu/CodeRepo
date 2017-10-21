package collection.map;

import java.util.Arrays;

/**
 * Created by Yang on 2017/10/21 0021.
 * 手动实现HashMap基本功能，效率较低版
 */
public class SxtHashMap {
    private SxtEntry[] arr = new SxtEntry[999];
    private int size;

    public void put(Object key, Object value) {
        for (int i = 0; i < size; i++) {
            if (arr[i].key.equals(key)) {
                arr[i].value = value;
                return;
            }
        }
        arr[size++] = new SxtEntry(key, value);
    }

    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            if (arr[i].key.equals(key)) {
                return arr[i].value;
            }
        }
        return null;
    }

    public void remove(Object key) {
        for (int i = 0; i < size; i++) {
            if (arr[i].key.equals(key)) {
                arr[i] = null;
            }
        }
    }

    public boolean containskey(Object key) {
        for (int i = 0; i < size; i++) {
            if (arr[i].key.equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer sbf = new StringBuffer("SxtHashMap{");
        for (int i = 0; i < size; i++) {
            String str = arr[i].toString();
            sbf = new StringBuffer(sbf + str);
        }
        return sbf.toString();
    }
}

class SxtEntry {
    Object key;
    Object value;

    public SxtEntry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SxtEntry{" +
                "key=" + key +
                ", value=" + value.toString() +
                '}';
    }
}
