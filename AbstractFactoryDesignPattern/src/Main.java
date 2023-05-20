import Factory.ModernFurnitureFactory;
import Product.Chair;
import Product.Sofa;

public class Main {
    public static void main(String[] args) {
        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair chair = modernFurnitureFactory.createChair();
        chair.getName();
        Sofa sofa = modernFurnitureFactory.createSofa();
        sofa.getName();
    }
}