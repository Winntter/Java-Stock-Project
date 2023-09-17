package entities;

public class  Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() { // Return Price * Quantity ;
        return price * quantity;
    }
    public void addProduct(int quantity) { //
        this.quantity += quantity ; // Access THIS attribute
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString () {
        return name.toUpperCase()
            + ", $"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, "
            + " Total: $"
            + String.format("%.2f", TotalValueInStock());
    }
}
