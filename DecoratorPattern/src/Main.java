import Base.MilkTea;
import Decorators.BlackPearl;
import Decorators.EggPudding;
import Decorators.FruitPudding;

public class Main {
    public static void main(String[] args) {
        var firstMilkTea = new BlackPearl(
                                new MilkTea(10000));
        System.out.println("BlackPearlMilkTea: " + firstMilkTea.cost());

        var secondMilkTea = new EggPudding(
                                new FruitPudding(
                                    new BlackPearl(
                                            new MilkTea(10000))));
        System.out.println("EggPuddingFruitPuddingBlackPearlMilkTea: " + secondMilkTea.cost());
    }
}