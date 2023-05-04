public class Duck {
    private int _id;
    private String _gender;
    private String _price;
    private IFlyStrategy _flyStrategy;

    public Duck() {

    }

    public Duck(IFlyStrategy flyStrategy) {
        _flyStrategy = flyStrategy;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_gender() {
        return _gender;
    }

    public void set_gender(String _gender) {
        this._gender = _gender;
    }

    public String get_price() {
        return _price;
    }

    public void set_price(String _price) {
        this._price = _price;
    }

    public IFlyStrategy get_flyStrategy() {
        return _flyStrategy;
    }

    public void set_flyStrategy(IFlyStrategy _flyStrategy) {
        this._flyStrategy = _flyStrategy;
    }

    public void fly() {
        this._flyStrategy.doFly();
    }
}
