package Base;

public abstract class MilkTeaDecorator implements IMilkTea {
    private IMilkTea milkTea;

    protected MilkTeaDecorator(IMilkTea inner) {
        this.milkTea = inner;
    }
    @Override
    public int cost() {
        return milkTea.cost();
    }
}
