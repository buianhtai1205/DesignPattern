package Factory;

import Product.Chair;
import Product.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
