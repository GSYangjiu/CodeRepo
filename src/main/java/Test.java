import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by Yang on 2017/10/25 0025.
 */
public class Test {
    public final int i = 1;

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= 0 && hour < 8) { // 每天0点至8点不发送消息
            return;
        }
        System.out.println(hour);
    }
}
