package strategy;

public class Item {

    private String uniqueCode;
    private int price;

    public Item(String uniqueCode, int price) {
        this.uniqueCode = uniqueCode;
        this.price = price;
    }

    public String getUpcCode() {
        return uniqueCode;
    }

    public int getPrice() {
        return price;
    }

}
