import java.util.ArrayList;

public class Store {
    private ArrayList<ProductForSale> list = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void addItemToOrder(ProductForSale item){
        list.add(item);
        System.out.println("Added: " + item.getType());
    }

    public void printOrder(){
        System.out.println("Shopping Order:");
        for (ProductForSale i: list ){
            System.out.println(i.getType());
        }
    }
}
