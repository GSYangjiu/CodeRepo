package utils.email;

import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Yang on 2017/11/6 0006.
 */
public class JavaMail {
    public static void send(String subject, String content, String[] to) throws Exception {
        org.springframework.mail.javamail.JavaMailSenderImpl javaMailSender = new org.springframework.mail.javamail.JavaMailSenderImpl();
        javaMailSender.setHost("smtp.qq.com");
        javaMailSender.setPort(465);
        javaMailSender.setUsername("vincent@yangmiemie.info");
        javaMailSender.setPassword("igaasdsrzuiijjec");
        javaMailSender.setDefaultEncoding("UTF-8");

        Properties properties = new Properties();
        properties.setProperty("mail.smtp.auth", "true");//开启认证
        properties.setProperty("mail.debug", "true");//启用调试
        properties.setProperty("mail.smtp.timeout", "1000");//设置链接超时
        properties.setProperty("mail.smtp.port", Integer.toString(465));//设置端口
        properties.setProperty("mail.smtp.socketFactory.port", Integer.toString(465));//设置ssl端口
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        javaMailSender.setJavaMailProperties(properties);

        MimeMessage mailMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);
        messageHelper.setTo(to);
        messageHelper.setFrom("vincent@yangmiemie.info");
        messageHelper.setSubject(subject);
        messageHelper.setText(content, true);
        javaMailSender.send(mailMessage);
    }

    public static void main(String[] args) throws Exception {
        try {
            String[] to = new String[]{"vincent1094259423@163.com"};

            String content = "测试一下";
            send("测试邮件", content, to);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
