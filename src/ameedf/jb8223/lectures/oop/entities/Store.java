package ameedf.jb8223.lectures.oop.entities;

public class Store {
    private Product[] products;

    public Store(int numberOfProducts) {
        this.products = new Product[numberOfProducts];
    }

    public void addProduct(String productName, float price) {
        int index = nextIndex();
        if (index >= 0) {
            Product newProduct = new Product((index + 1) * 10, productName, price);
            products[index] = newProduct;
            System.out.println("Added '" + productName + "' to the store.. There are now " + (index + 1) + " products");
        } else {
            System.out.println("Can't add '" + productName + "' !!");
        }
    }

    public void updatePrices(float percent) {
        for (Product product : products) {
            if (product != null) {
                product.updatePrice(percent);
            }
        }
    }

    public void printPrice(String productName) {
        for (Product product : products) {
            if (product != null && product.getName().equals(productName)) {
                System.out.println("The price for " + productName + " is " + product.getPrice());
                return;
            }
        }
        System.out.println("Couldn't find product " + productName);
    }

    public void print() {
        for (Product product : products) {
            if (product != null) {
                product.print();
            }
        }
    }

    private int nextIndex() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                return i;
            }
        }
        return -1; // no place available
    }

}
