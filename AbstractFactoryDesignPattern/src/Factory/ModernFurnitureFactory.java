package Factory;

import Product.Chair;
import Product.ModernChair;
import Product.ModernSofa;
import Product.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
