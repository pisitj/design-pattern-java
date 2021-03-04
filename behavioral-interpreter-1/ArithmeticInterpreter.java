import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class ArithmeticInterpreter {
    public static ArithmeticInterpreter interpreter = new ArithmeticInterpreter();

    public static boolean precedence(char a, char b) {
        String high = "*/";
        String low = "+-";

        if (a == '(') {
            return false;
        }
        if (a == ')' && b == '(') {
            System.out.println(")-(");
            return false;
        }
        if (b == '(') {
            return false;
        }
        if (b == ')') {
            return true;
        }
        if (high.indexOf(a) >  - 1 && low.indexOf(b) >  - 1) {
            return true;
        }
        if (high.indexOf(a) >  - 1 && high.indexOf(b) >  - 1) {
            return true;
        }
        if (low.indexOf(a) >  - 1 && low.indexOf(b) >  - 1) {
            return true;
        }
        return false;
    }
    
    public static String convertToPostfix(String expression) {
        Stack<Character> operationStack = new Stack<>();
        StringBuilder output = new StringBuilder();
        String operations = "+-*/()";
        char topSymbol = '+';
        boolean empty;
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (operations.indexOf(token.charAt(0)) == -1) {
                output.append(token);
                output.append(" ");
            } else {
                while(!(empty = operationStack.isEmpty()) && interpreter.precedence(topSymbol = operationStack.pop(), token.charAt(0))) {
                    output.append(topSymbol);
                    output.append(" ");
                }
                if (!empty) {
                    operationStack.push(topSymbol);
                }
                if (empty || (token.charAt(0) != ')')) {
                    operationStack.push(token.charAt(0));
                } else {
                    topSymbol = operationStack.pop();
                }
            }
        }
        while (!operationStack.isEmpty()) {
            output.append(operationStack.pop());
            output.append(" ");
        }
        return output.toString();
    }

    public static Operand buildSyntaxTree(String tree) {
        Stack<Operand> stack = new Stack<>();
        String operations = "+-*/";
        String[] tokens = tree.split(" ");
        for (String token : tokens) {
            if (operations.indexOf(token.charAt(0)) == -1){
                Operand term;
                try {
                    term = new Number(Double.parseDouble(token));
                } catch (NumberFormatException ex) {
                    term = new Variable(token);
                }
                stack.push(term);
            } else {
                Expression expression = new Expression(token.charAt(0));
                expression.right = stack.pop();
                expression.left = stack.pop();
                stack.push(expression);
            }
        }
        return stack.pop();
    }
}
