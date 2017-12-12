package utils.jiguangPush;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

/**
 * Created by Yang on 2017/11/6 0006.
 */
public class PushDemo {
    private static final String APP_KEY = "2b2662464e7df03b07bce81b";
    private static final String MASTER_SECRET = "40a9b12e6ececf00146c8373";

    public static void main(String[] args) {
        push();
    }

    private static void push() {
        JPushClient jPushClient = new JPushClient(MASTER_SECRET, APP_KEY);

        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.all())
                .setNotification(Notification.alert("PushDemo Notification Hotel"))
                .setMessage(Message.content("PushDemo Message Hotel"))
                .build();

        try {
            PushResult result = jPushClient.sendPush(payload);
            System.out.println("success");
            System.out.println(result.msg_id);
            System.out.println(result.sendno);
        } catch (APIConnectionException e) {
            System.out.println("connection error");
            e.printStackTrace();
        } catch (APIRequestException e) {
            System.out.println("request error");
            e.printStackTrace();
        }
    }
}
