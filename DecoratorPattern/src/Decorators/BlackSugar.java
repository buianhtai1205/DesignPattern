package Decorators;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    private int price = 4000;
    public BlackSugar(IMilkTea inner) {
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
