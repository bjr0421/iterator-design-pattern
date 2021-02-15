/**
 * WishList for Items
 * @author Brooks Robinson
 */
public class WishList {
    private String name;
    private Item[] items;
    private int count;

    /**
     * Constructor for WishList Object
     * @param name name of given item
     */
    public WishList(String name) {
        items = new Item[5];
        this.name = name;
    }

    /**
     * Adds an item to the Item array
     * @param title title of the item
     * @param description description of the item
     * @param price price of the item
     */
    public void addItem(String title, String description, double price) {
        Item anItem = new Item(title, description, price);

        if (count == items.length) {
            growArray(items);
        }

        items[count] = anItem;
        count++;
    }

    /** 
     * Creates an iterator for the WishList
     * @return a new iterator for the WishList array of items
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    /** 
     * Combines the prices of each item in the Item array
     * @return the combined prices of items in the array
     */
    public double getTotalCost() {
        double cost = 0.0;
        for (int i = 0; i < count; ++i) {
            cost += items[i].getPrice();
        }

        return cost;
    }

    /**
     * Helper method to extend size of Item array
     * @param items original array of Items
     * @return original array, but doubled in size
     */
    private Item[] growArray(Item[] items) {
        Item[] bigArray = new Item[10];
        for (int i = 0; i < 5; ++i) {
            bigArray[i] = items[i];
        }
        return bigArray;
    }  
}
