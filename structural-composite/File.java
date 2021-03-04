public class File extends Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void traverse() {
        System.out.println(name);
    }
}