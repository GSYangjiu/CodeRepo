package designPattern.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-08-27 14:27
 * Description:
 */
public class SerSingletonTest {
    @Test
    public void test() throws Exception {
        SerSingleton s1 = null;
        SerSingleton s = SerSingleton.getInstance();
        //先将实例串行化到文件
        FileOutputStream fos = new FileOutputStream("SerSingleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();
        //从文件中读出原有的单例类
        FileInputStream fis = new FileInputStream("SerSingleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (SerSingleton) ois.readObject();
        Assert.assertEquals(s, s1);
    }
}