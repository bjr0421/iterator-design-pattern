import java.util.Iterator;

public class WishListIterator implements Iterator {
    private Item[] items;
    private int position;

    public WishListIterator(Item[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Item next() {
        if (!hasNext())
            return null;
        Item nextOne = items[position];
        position += 1;
        return nextOne;
    }
}
