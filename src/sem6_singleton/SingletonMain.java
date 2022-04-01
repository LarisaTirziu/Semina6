package sem6_singleton;

import sem6_singleton.Singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton instance1;
        instance1 = Singleton.returnInstance();
        Singleton instance2;
        instance2 = Singleton.returnInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
