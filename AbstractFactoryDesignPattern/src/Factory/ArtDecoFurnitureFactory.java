package Factory;

import Product.ArtDecoChair;
import Product.ArtDecoSofa;
import Product.Chair;
import Product.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
