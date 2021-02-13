/**
 * Item, a Object
 * @author Brooks Robinson
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Constructor for Item Object
     * @param title title of the item
     * @param description description of the item
     * @param price price of the item
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Returns the title, description, and price of the item
     * @return price, description, and title of the item
     */
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nPrice: " + price;
    }

    /**
     * Gets the price of the item
     * @return price of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Prints the properties of the item in a formatted manner
     */
    public void print() {
        System.out.println("\n***** " + title + " *****");
        System.out.println(description);
        System.out.println("Price: $" + price);
    }
}
