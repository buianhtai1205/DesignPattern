public class NoFlyStrategy implements IFlyStrategy{

    @Override
    public void doFly() {
        System.out.println("I don't know how to fly, please!");
    }
}
