public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> GlobalResourceSingleton.getInstance().sayHelloWorld());
        Thread thread2 = new Thread(() -> GlobalResourceSingleton.getInstance().sayHelloWorld());

        thread1.start();
        thread2.start();
    }
}