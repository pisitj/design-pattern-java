public class MainApp {
	
    public static void main(String[] args) {
        IteratorFactory iteratorFactory = new IteratorFactory();

        for(Iterator iterator = iteratorFactory.createIterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
