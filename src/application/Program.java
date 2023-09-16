package application;

import java.util.*;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
            System.out.println("Enter the product data:");
            System.out.print("Name: ");
        product.name = sc.nextLine();
            System.out.print("Price: ");
        product.price = sc.nextDouble();
            System.out.print("Quantity: ");
        product.quantity = sc.nextInt();
            System.out.println(product.name + ", $" + product.price + ", " + product.quantity + ".");

        sc.close();
    }
}
