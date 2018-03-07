public class Bill implements Money{
    public int value;

    public Bill(int value){
        this.value = value;
    }

    @Override
    public double getAmount() {
        return value;
    }

    @Override
    public String toString() {
        return "$"+value;
    }
}
