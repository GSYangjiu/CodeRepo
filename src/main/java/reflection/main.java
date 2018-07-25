package reflection;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by Yang.
 * Email : vincent1094259423@yahoo.com
 * Date  : 2018-05-22 14:32
 * Description:
 */
public class main {
    public static void main(String[] args) {
        Class<?> c1 = null;
        try {
            c1 = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
            System.exit(1);
        }

        Set<String> s = null;
        try {
            s = (Set<String>) c1.newInstance();
        } catch (IllegalAccessException e) {
            System.err.println("Class not accessible");
            System.exit(1);
        } catch (InstantiationException e) {
            System.err.println("Class not instantiable");
            System.exit(1);
        }

        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}
