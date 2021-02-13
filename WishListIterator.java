/**
 * WishListIterator, an Iterator for WishList
 * @author Brooks Robinson
 */
public class WishListIterator implements Iterator {
    private Item[] items;
    private int position;

    /**
     * Constructor for WishListIterator Object
     * @param items array of Item objects
     */
    public WishListIterator(Item[] items) {
        this.items = items;
    }

    /**
     * Bool to return whether the array has any space left in it
     */
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns the next item in the array
     */
    public Item next() {
        if (!hasNext())
            return null;
        Item nextOne = items[position];
        position += 1;
        return nextOne;
    }
}
