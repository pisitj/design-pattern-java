import java.util.ArrayList;

public class Directory extends Composite {
    private String name;
    private ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    public void traverse() {
        System.out.println(name);
        for (Object fileObj : includedFiles) {
            Component file = (Component) fileObj;
            file.traverse();
        }
    }
}
