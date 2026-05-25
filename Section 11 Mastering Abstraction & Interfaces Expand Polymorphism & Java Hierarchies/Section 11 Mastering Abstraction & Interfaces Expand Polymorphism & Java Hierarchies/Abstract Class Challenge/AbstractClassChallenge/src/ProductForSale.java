public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPricedItem(int qty){
        System.out.println(type + " $" + price + " x " + qty + " = " + (qty * price));
    }

    public double getSalesPrice(int qty){
        return (qty * price);
    }

    public abstract void showDetails();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
