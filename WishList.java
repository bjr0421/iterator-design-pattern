public class WishList {

    private String name;
    private Item[] items;
    private int count;

    public WishList(String name) {
        items = new Item[5];
        this.name = name;
    }

    public void addItem(String title, String description, double price) {

        Item anItem = new Item(title, description, price);

        if (count > 4) {
            growArray(items);
        }

        items[count] = anItem;
        count++;
    }

    public WishListIterator createIterator() {

        return new WishListIterator(items);

    }

    public double getTotalCost() {
        double cost = 0.0;
        for (int i = 0; i < count; ++i) {
            cost += items[i].getPrice();
        }

        return cost;
    }

    private Item[] growArray(Item[] items) {
        Item[] bigArray = new Item[10];
        for (int i = 0; i < 5; ++i) {
            bigArray[i] = items[i];
        }
        return bigArray;
    }
    
}
