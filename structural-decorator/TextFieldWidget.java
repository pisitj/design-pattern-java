class TextFieldWidget implements Widget {
    private int width;
    private int height;

    public TextFieldWidget(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("TextField: " + width + " * " + height);
    }

}