package utils.email;

import org.ho.yaml.Yaml;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-05-21 10:43
 * Description:
 */
public class MailSender {

    private final static String HTML = "text/html;charset=UTF-8";
    private final static String TEXT = "text";
    private static MailEntity mail = new MailEntity();

    static {
        // 创建Properties 类用于记录邮箱的一些属性
        MailEntity m = null;
        try {
            File dumpFile = new File("E:\\Yang\\CodeRepo\\src\\main\\java\\utils\\email\\mail.yml");
            m = Yaml.loadType(dumpFile, MailEntity.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert m != null;
        mail.setSmtpPort(m.getSmtpPort());
        mail.setFromMailAddress(m.getFromMailAddress());
        mail.setSmtpService(m.getSmtpService());
        mail.setFromMailSmtpPwd(m.getFromMailSmtpPwd());
        mail.setNickName(m.getNickName());
    }

    public MailSender title(String title) {
        mail.setTitle(title);
        return this;
    }

    public MailSender content(String content) {
        mail.setContent(content);
        return this;
    }

    public MailSender target(List<String> list) {
        mail.setList(list);
        return this;
    }

    public void send() throws Exception {
        if (mail.getContentType() == null) {
            mail.setContentType("text/html;charset=UTF-8");
        }

        if (mail.getTitle() == null || mail.getTitle().trim().length() == 0) {
            throw new Exception("邮件标题没有设置.调用title方法设置");
        }

        if (mail.getContent() == null || mail.getContent().trim().length() == 0) {
            throw new Exception("邮件内容没有设置.调用content方法设置");
        }

        if (mail.getList().size() == 0) {
            throw new Exception("没有接受者邮箱地址.调用targets方法设置");
        }

        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mail.getFromMailAddress(), mail.getFromMailSmtpPwd());
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(props, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        String nickName = MimeUtility.encodeText(mail.getNickName());
        InternetAddress form = new InternetAddress(nickName + " <" + mail.getFromMailAddress() + ">");
        message.setFrom(form);

        // 设置邮件标题
        message.setSubject(mail.getTitle());
        //html发送邮件
        if (HTML.equalsIgnoreCase(mail.getContentType())) {
            // 设置邮件的内容体
            message.setContent(mail.getContent(), mail.getContentType());
        } else if (TEXT.equalsIgnoreCase(mail.getContentType())) {
            //文本发送邮件
            message.setText(mail.getContent());
        }

        //发送邮箱地址
        mail.getList().forEach(m -> {
            try {
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(m));
                // 发送邮件
                Transport.send(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}


