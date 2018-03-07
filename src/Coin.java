public abstract class Coin implements Money {
    double value;

    public Coin(double value){
        this.value = value;
    }
    @Override
    public double getAmount() {
        return value;
    }
}
