package Base;

public class MilkTea implements IMilkTea {
    private int price;

    public MilkTea(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int cost() {
        return getPrice();
    }
}
