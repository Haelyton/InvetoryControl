package Application;

import Entity.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        Product product = new Product();

        System.out.println("Enter product Data: ");
        System.out.print("Name Product: ");
        product.name = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Price: ");
                product.price = Float.parseFloat(scanner.nextLine());
                if (product.price > 0){
                    break;
                }
                else {
                    System.out.println("Price must be greater than zero!");
                }
            }catch (NumberFormatException e){
                System.out.println("\nInvalid Input! Please enter a numeric value.");
            }
        }

        while (true) {
            try {
                System.out.print("Quantity: ");
                product.quantity = Integer.parseInt(scanner.nextLine());
                if (product.quantity > 0){
                    break;
                }
                else{
                    System.out.println("Quantity must be greater than zero!");
                }
            }
            catch (NumberFormatException e){
                System.out.print("Invalid Input! Please enter a numeric value.");
            }
        }


        System.out.println(product.name + ", R$" + product.price + ", " + product.quantity);


        scanner.close();

    }
}
