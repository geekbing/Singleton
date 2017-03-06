public class Main {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getUniqueInstance();
        Singleton1 singleton2 = Singleton1.getUniqueInstance();
        System.out.println(singleton1 == singleton2);

        Singleton2 singleton3 = Singleton2.getUniqueInstance();
        Singleton2 singleton4 = Singleton2.getUniqueInstance();
        System.out.println(singleton3 == singleton4);

        Singleton3 singleton5 = Singleton3.getUniqueInstance();
        Singleton3 singleton6 = Singleton3.getUniqueInstance();
        System.out.println(singleton5 == singleton6);

        Singleton4 singleton7 = Singleton4.getUniqueInstance();
        Singleton4 singleton8 = Singleton4.getUniqueInstance();
        System.out.println(singleton7 == singleton8);
    }
}
