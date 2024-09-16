/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);

    // TODO finish adding abstract methods to fully describe what it means to be a MultiSet.
    public void remove(int x) {}
    public boolean isEmpty() { return false; }
    public int count(String a, String b) { return 0; }
    public int size() { return 0; }
    public static void main(String[] args) {}
}
