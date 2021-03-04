public class Process2 extends Template {
    public Process2() {
    }

    @Override
    void initialize() {
        System.out.println("Process 2 : Initialize");
    }

    @Override
    void start() {
        System.out.println("Process 2 : Start");
    }

    @Override
    void end() {
        System.out.println("Process 2 : End");
    }
}
