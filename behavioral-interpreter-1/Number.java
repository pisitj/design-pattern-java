import java.util.Map;

public class Number implements Operand {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public void traverse(int level) {
        System.out.println("traverse Number: " + value);
    }

    public double evaluate(Map<String, Integer> context) {
        return value;
    }
}
