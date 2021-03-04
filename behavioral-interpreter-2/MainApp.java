public class MainApp {
    public static Expression getFemaleExpression(){
        Expression female1 = new TerminalExpression("Miss");
        Expression female2 = new TerminalExpression("Mrs.");
        return new OrExpression(female1, female2);
    }

    public static Expression getCoupleExpression(){
        Expression female = new TerminalExpression("Mrs.");
        Expression male = new TerminalExpression("Mr.");
        return new AndExpression(female, male);
    }

    public static void main(String[] args) {
        Expression isFemale = getFemaleExpression();
        Expression isCouple = getCoupleExpression();

        System.out.println(isFemale.interpret("Mr. John"));
        System.out.println(isFemale.interpret("Mrs. John"));
        System.out.println(isFemale.interpret("Miss Julie"));

        System.out.println(isCouple.interpret("Mr. John"));
        System.out.println(isCouple.interpret("Mr. & Mrs. John"));

    }
}
