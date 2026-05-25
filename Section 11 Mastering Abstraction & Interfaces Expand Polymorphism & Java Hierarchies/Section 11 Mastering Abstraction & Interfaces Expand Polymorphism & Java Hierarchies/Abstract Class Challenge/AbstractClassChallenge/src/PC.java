public class PC extends ProductForSale {
    private int ram;
    private int storage;

    public PC(String type, double price, String description, int ram, int storage) {
        super(type, price, description);
        ram = ram;
        storage = storage;
    }

    @Override
    public void showDetails() {
        System.out.println("PC has " + ram + "GB of RAM and " + storage + " GB of SSD Storage" );
    }
}
