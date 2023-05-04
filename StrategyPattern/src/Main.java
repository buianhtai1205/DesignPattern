public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.set_flyStrategy(new NoFlyStrategy());
        System.out.print("Duck 1: ");
        duck1.fly();

        Duck duck2 = new Duck();
        duck2.set_flyStrategy(new FlyHighStrategy());
        System.out.print("Duck 2: ");
        duck2.fly();

        Duck duck3 = new Duck();
        duck3.set_flyStrategy(new FlyLowStrategy());
        System.out.print("Duck 3: ");
        duck3.fly();
    }
}