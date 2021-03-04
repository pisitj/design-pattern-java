public class IteratorFactory implements Factory {
    private final String[] names = {"Robert" , "John" ,"Julie" , "Lora"};
    private int index = -1;

    public Iterator createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        public NameIterator() {
            index++;
        }

        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
