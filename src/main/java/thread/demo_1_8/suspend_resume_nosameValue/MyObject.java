package thread.demo_1_8.suspend_resume_nosameValue;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-03-29 11:30
 * Description:
 */
public class MyObject {
    private String username = "1";
    private String password = "11";

    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
