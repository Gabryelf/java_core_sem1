package org.example.notes.exceptions.emulator_shop;

public class Main {
    private static Order[] orders;
    private static int totalPurchases = 0;

    static Buyer[] buyers = { new Buyer("Mark", 1), new Buyer("Olga", 2), new Buyer("Max", 3) };
    static Product[] products = { new Product("Laptop", 10, 1000), new Product("Phone", 5, 500), new Product("TV", 2, 2000) };


    public static void main(String[] args) {
        initArrays();
        try {
            makePurchase("Mark", "Laptop", 2);
            makePurchase("Olga", "Phone", -3);
            makePurchase("Max", "TV", 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Всего покупок: " + totalPurchases);
    }

    private static void initArrays() {

        orders = new Order[10];

    }

    public static void makePurchase(String buyerName, String productName, int quantity) throws Exception {
        Buyer buyer = getBuyerByName(buyerName);
        Product product = getProductByName(productName);

        if (buyer == null) {
            throw new Exception("Покупатель не найден!");
        }
        if (product == null) {
            throw new Exception("Товар не найден!");
        }
        if (quantity <= 0) {
            throw new Exception("Неверное количество!");
        }

        Order order = new Order(buyer, product, quantity);
        orders[totalPurchases] = order;
        totalPurchases++;
    }

    private static Buyer getBuyerByName(String name) {

        for (Buyer buyer : buyers) {
            if (buyer.getName().equals(name)) {
                return buyer;
            }
        }
        return null;
    }

    private static Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
