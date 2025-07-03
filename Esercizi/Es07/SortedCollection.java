public class SortedCollection implements Sortable {

    private Sorter s;

    public SortedCollection() {
        s = new QuickSorter();
    }

    public void add() {
        System.out.println("SortedCollection.add()");
    }

    public void get() {
        System.out.println("SortedCollection.get()");
    }

    public void remove() {
        System.out.println("SortedCollection.remove()");
    }

    public void sort() {
        s.sort();
    }

    public boolean compare() {
        System.out.println("SortedCollection.compare()");
        return true; 
    }

    public void swap() {
        System.out.println("SortedCollection.swap()");
    }

    public int count() {
        System.out.println("SortedCollection.count()");
        return 0; 
    }
}