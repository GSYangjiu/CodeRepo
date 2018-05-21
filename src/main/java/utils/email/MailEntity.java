package utils.email;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-05-21 10:38
 * Description:
 */
public class MailEntity {
    //SMTP服务器
    private String smtpService;
    //设置端口号
    private String smtpPort;
    //设置发送邮箱地址
    private String fromMailAddress;
    //设置发送邮箱的SMTP口令
    private String fromMailSmtpPwd;
    //设置邮箱标题
    private String title;
    //设置邮件内容
    private String content;
    //设置邮件内容格式（默认html）
    private String contentType;
    //nickname
    private String nickName;
    //接受邮件集合
    private List<String> list = new ArrayList<>();

    public String getSmtpService() {
        return smtpService;
    }

    public void setSmtpService(String smtpService) {
        this.smtpService = smtpService;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getFromMailAddress() {
        return fromMailAddress;
    }

    public void setFromMailAddress(String fromMailAddress) {
        this.fromMailAddress = fromMailAddress;
    }

    public String getFromMailSmtpPwd() {
        return fromMailSmtpPwd;
    }

    public void setFromMailSmtpPwd(String fromMailSmtpPwd) {
        this.fromMailSmtpPwd = fromMailSmtpPwd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "MailEntity{" +
                "smtpService='" + smtpService + '\'' +
                ", smtpPort='" + smtpPort + '\'' +
                ", fromMailAddress='" + fromMailAddress + '\'' +
                ", fromMailSmtpPwd='" + fromMailSmtpPwd + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", contentType='" + contentType + '\'' +
                ", nickName='" + nickName + '\'' +
                ", list=" + list +
                '}';
    }
}
