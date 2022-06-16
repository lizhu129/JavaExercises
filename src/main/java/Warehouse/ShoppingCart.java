package Warehouse;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.shoppingCart.containsKey(product)) {
            this.shoppingCart.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, price);
            this.shoppingCart.put(product, item);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (String product : this.shoppingCart.keySet()) {
            totalPrice = totalPrice + this.shoppingCart.get(product).price();
            continue;
        }
        return totalPrice;
    }

    public void print() {
        for (String product : this.shoppingCart.keySet()) {
            System.out.println(this.shoppingCart.get(product).toString());
        }

    }



}
