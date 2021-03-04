public abstract class Template {
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void runTemplateMethod() {
        initialize();
        start();
        end();
    }
}
