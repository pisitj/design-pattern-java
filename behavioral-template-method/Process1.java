public class Process1 extends Template {
    public Process1() {
    }

    @Override
    void initialize() {
        System.out.println("Process 1 : Initialize");
    }

    @Override
    void start() {
        System.out.println("Process 1 : Start");
    }

    @Override
    void end() {
        System.out.println("Process 1 : End");
    }
}
