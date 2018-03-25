package designPattern.observer.demo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by: Yang
 * Date: 2018-03-13
 * Time: 20:19
 */
public class UniversityStudent implements Observer {
    Subject subject;
    File myFile;

    public UniversityStudent(Subject subject, String fileName) {
        this.subject = subject;
        subject.addObserver(this);
        myFile = new File(fileName);
    }

    @Override
    public void hearTelephone(String heardMess) {
        try {
            RandomAccessFile out = new RandomAccessFile(myFile, "rw");
            out.seek(out.length());
            byte[] b = heardMess.getBytes();
            out.write(b);
            System.out.print("我是一个大学生，");
            System.out.println("我向文件" + myFile.getName() + "写入如下内容：");
            System.out.println(heardMess);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
