import java.util.Random;

public class GlobalResourceSingleton {
    private static volatile GlobalResourceSingleton uniqueInstance;
    private static final Object lock = new Object();
    private int index;

    private GlobalResourceSingleton(int index) {
        this.index = index;
    }

    public static GlobalResourceSingleton getInstance() {
        GlobalResourceSingleton r = uniqueInstance;
        if (r == null) {
            synchronized (lock) {       // while we were waiting lock, another thread may have instantiated the object
                r = uniqueInstance;
                if (r == null) {
                    Random random = new Random();
                    r = new GlobalResourceSingleton(random.nextInt());
                    uniqueInstance = r;
                }
            }
        }
        return r;
    }

    public void sayHelloWorld() {
        System.out.println("Hello world!: " + index);
    }
}
