/**
 * Author: bing
 * Date: 2017-03-06 10:42
 * Email: dhuzbb@163.com
 */
public class Singleton3 {

    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getUniqueInstance() {
        return uniqueInstance;
    }
}
