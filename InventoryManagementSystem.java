

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 20, 499.99);

        manager.addProduct(product1);
        manager.addProduct(product2);

        System.out.println("Initial Inventory:");
        manager.displayInventory();

        // Update product
        Product updatedProduct1 = new Product("1", "Laptop", 15, 899.99);
        manager.updateProduct(updatedProduct1);

        System.out.println("Inventory after update:");
        manager.displayInventory();

        // Delete product
        manager.deleteProduct("2");

        System.out.println("Inventory after deletion:");
        manager.displayInventory();
    }
}