package onlinebookstore.demo;


import java.util.Scanner;

public class Cart {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        Discount regularCustomerDiscount = new RegularCustomer(10);
        shoppingCart.setDiscount(regularCustomerDiscount);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. View Available Books");
            System.out.println("2. Add Book to Cart");
            System.out.println("3. Remove Book from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. check discount");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shoppingCart.viewAvailableBooks();
                    break;
                case 2:
                    shoppingCart.addBookToCart(scanner);
                    break;
                case 3:
                    shoppingCart.removeBookFromCart(scanner);
                    break;
                case 4:
                    shoppingCart.viewCart();//show the items in cart
                    break;
                case 5:
                    shoppingCart.showTotalPrice(); // Show total price with discount applied
                    break;
                case 6:
                    shoppingCart.checkout();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;


            }
        } while (choice != 7);

        scanner.close();
    }
}





