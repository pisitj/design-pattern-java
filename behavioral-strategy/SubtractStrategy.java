public class SubtractStrategy implements Strategy {
    public SubtractStrategy() {
    }

    @Override
    public int operate(int num1, int num2) {
        return num1 - num2;
    }
}
