import java.util.ArrayList;
import java.util.Scanner;

public class MiniProject {
    static ArrayList<Product> a1;
    static Scanner sc;

    public static void addProduct() {
        System.out.println("Enter the product id, name, and price:");
        int id = sc.nextInt();
        String n = sc.next();
        float p = sc.nextFloat();
        Product p1 = new Product(id, n, p);
        a1.add(p1);
        System.out.println("Product added successfully.");
    }

    public static void removeProduct() {
        System.out.println("Enter the product ID to remove:");
        int id = sc.nextInt();
        Product toRemove = null;
        for (Product p : a1) {
            if (p.getId() == id) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            a1.remove(toRemove);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void updateProduct() {
        System.out.println("Enter the product ID to update:");
        int id = sc.nextInt();
        Product toUpdate = null;
        for (Product p : a1) {
            if (p.getId() == id) {
                toUpdate = p;
                break;
            }
        }
        if (toUpdate != null) {
            System.out.println("Enter the new price:");
            float newPrice = sc.nextFloat();
            toUpdate.setPrice(newPrice);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void showProducts() {
        if (a1.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product x : a1) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        a1 = new ArrayList<Product>();
        int ch;
        do {
            System.out.println("\n1. Add a new Product");
            System.out.println("2. Remove product");
            System.out.println("3. Update product");
            System.out.println("4. Show all products");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    showProducts();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (ch != 7);
        sc.close();
    }
}