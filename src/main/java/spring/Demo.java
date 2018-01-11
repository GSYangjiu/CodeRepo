package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.entity.Student;

/**
 * Created by Yang on 2018/1/10 0010.
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-web-context.xml");
        Student yang = (Student) context.getBean("yang");
        System.out.println(yang.toString());
    }
}
