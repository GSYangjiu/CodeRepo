import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.entity.UserManger;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-07-25 11:14
 * Description:
 */
public class TestDemo {

    @Test
    public void testData() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-web-context.xml");
        UserManger userManger = (UserManger) ctx.getBean("userManger");
        System.out.println(userManger);
    }
}