package Decorators;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class BlackPearl extends MilkTeaDecorator {
    private int price = 5000;

    public BlackPearl(IMilkTea inner) {
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
