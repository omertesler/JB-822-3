package ameedf.jb8223.lectures.oop;

import ameedf.jb8223.lectures.oop.entities.Store;

public class StoreApplication {

    public static void main(String[] args) {
        Store store = new Store(5);
        store.addProduct("Tomatoes", 10.5f);
        store.addProduct("Apples", 6.5f);
        store.addProduct("Meat", 165.59f);
        store.addProduct("Coke", 11.9f);

        System.out.println("Before update");
        store.print();

        store.addProduct("Milk", 2.23f);
        store.addProduct("Ice cream", 20.41f);

        store.updatePrices(10);
        System.out.println("After update");
        store.print();

        store.printPrice("Milk");
        store.printPrice("Ice cream");
    }
}
