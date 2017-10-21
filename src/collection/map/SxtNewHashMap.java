package collection.map;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yang on 2017/10/21 0021.
 * map实现基于链表和数组
 * 改进低效率map
 */
public class SxtNewHashMap {
    private LinkedList[] arr = new LinkedList[999];
    private int size;

    public void put(Object key, Object value) {
        int hashCode = key.hashCode()%arr.length;
        LinkedList list = new LinkedList();
        SxtNewEntry entry = new SxtNewEntry(key, value);
        list.add(entry);
        arr[hashCode] = list;
        if (arr[hashCode]==null){
            size++;
        }
    }

    public Object get(Object key) {
        int hashCode = key.hashCode()%arr.length;
        List list = arr[hashCode];
        if (list!=null){
            for (int i=0;i<list.size();i++){
                SxtNewEntry entry = (SxtNewEntry)list.get(i);
                if (entry.key.equals(key)){
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(Object key) {
        int hashCode = key.hashCode()%arr.length;
        List list = arr[hashCode];
        if(list!=null){
            for (int i=0;i<list.size();i++){
                SxtNewEntry entry = (SxtNewEntry)list.get(i);
                if (entry.key.equals(key)){
                    list.remove(i);
                }
            }
        }
    }

    public boolean containskey(Object key) {
        int hashCode = key.hashCode()%arr.length;
        List list = arr[hashCode];
        if(list!=null){
            for (int i=0;i<list.size();i++){
                SxtNewEntry entry = (SxtNewEntry)list.get(i);
                if (entry.key.equals(key)){
                    return true;
                }
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

class SxtNewEntry {
    Object key;
    Object value;

    public SxtNewEntry(Object key, Object value) {
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