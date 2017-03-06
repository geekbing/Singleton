/**
 * Author: bing
 * Date: 2017-03-06 10:42
 * Email: dhuzbb@163.com
 */
public class Singleton4 {
    private volatile static Singleton4 uniqueInstance;

    private Singleton4() {
    }

    public static Singleton4 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
