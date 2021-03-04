import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        String context = "C * 9 / 5 + 32";
        System.out.println("context: " + context);
        
        String postfix = ArithmeticInterpreter.convertToPostfix(context);
        System.out.println("convertToPostfix: " + postfix);

        Operand expression = ArithmeticInterpreter.buildSyntaxTree(postfix);
        expression.traverse(1);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<= 100; i+=10) {
            map.put("C", i);
            System.out.println("C is " + i + ", F is " + expression.evaluate(map));
        }
    }
}
