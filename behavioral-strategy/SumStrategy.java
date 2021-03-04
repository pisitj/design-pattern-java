public class SumStrategy implements Strategy {
    public SumStrategy() {
    }

    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}
