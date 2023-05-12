package Decorators;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    private int price = 6000;
    public EggPudding(IMilkTea inner) {
        super(inner);
    }

    @Override
    public int cost() {
        return getPrice() + super.cost();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
