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
        javaMailSender.setHost("smtpdm.aliyun.com");
        javaMailSender.setPort(465);
        javaMailSender.setUsername("yanzheng@www.mugvip.com");
        javaMailSender.setPassword("MGvipyz123");
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

//		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
//		javaMailSender.setHost("smtpdm.aliyun.com");
//		javaMailSender.setUsername("yanzheng@www.mugvip.com");
//		javaMailSender.setPassword("MGvipyz123");
//		javaMailSender.setDefaultEncoding("UTF-8");
//		javaMailSender.setPort(465);
//		Properties javaMailProperties = new Properties();
//		javaMailProperties.setProperty("mail.smtp.auth", "true");
//		javaMailProperties.put("mail.smtp.starttls.enable", "true");
//		javaMailProperties.setProperty("mail.smtp.timeout", "25000");
//		javaMailSender.setJavaMailProperties(javaMailProperties);

        MimeMessage mailMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);
        messageHelper.setTo(to);
        messageHelper.setFrom("yanzheng@www.mugvip.com");
        messageHelper.setSubject(subject);
        messageHelper.setText(content, true);
        javaMailSender.send(mailMessage);
    }

    public static void main(String[] args) throws Exception {
        try {
            String[] to = new String[]{"sujun@mugvip.com"};

            String content = "尊敬的用户：您的校验码是175824，工作人员不会索取，请勿泄露。<br><br><br><img src='http://www.muguanglianyi.com/images/296167e7-befa-4ac7-9444-1d64fd157a24.jpeg'></img>";


            send("木光邮件",content, to);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
