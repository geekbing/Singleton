/**
 * Author: bing
 * Date: 2017-03-06 10:42
 * Email: dhuzbb@163.com
 */
public class Singleton2 {

    private static Singleton2 uniqueInstance;

    private Singleton2() {
    }

    public synchronized static Singleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
