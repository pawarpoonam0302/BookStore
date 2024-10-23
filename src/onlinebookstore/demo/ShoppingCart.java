package onlinebookstore.demo;



import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> cart;
    private Discount discount;


    // Constructor
    public ShoppingCart() {
        availableBooks = new ArrayList<>();
        cart = new ArrayList<>();
        loadBooks();
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    // Load some books into availableBooks
    private void loadBooks() {
        availableBooks.add(new Book("1984", 100, 9.99, "George Orwell"));
        availableBooks.add(new Book("Harry Potter and the Philosopher's Stone", 101, 19.99, "J.K. Rowling"));
        availableBooks.add(new Book("To Kill a Mockingbird", 102, 12.99, "Harper Lee"));
        availableBooks.add(new Book("The Great Gatsby", 103, 10.99, "F. Scott Fitzgerald"));
    }

    // Method to view available books
    public void viewAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < availableBooks.size(); i++) {
            System.out.println((i + 1) + ". " + availableBooks.get(i));
        }
    }

    // Method to add a book to the cart
    public void addBookToCart(Scanner scanner) {
        viewAvailableBooks();
        System.out.println("Enter the number of the book to add to cart:");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= availableBooks.size()) {
            Book selectedBook = availableBooks.get(choice - 1);
            cart.add(selectedBook);
            System.out.println(selectedBook.getTitle() + " has been added to your cart.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Method to remove a book from the cart
    public void removeBookFromCart(Scanner scanner) {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("Books in your cart:");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i).getTitle());
        }

        System.out.println("Enter the number of the book to remove from cart:");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= cart.size()) {
            Book removedBook = cart.remove(choice - 1);
            System.out.println(removedBook.getTitle() + " has been removed from your cart.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void showTotalPrice() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            double totalPrice = 0;
            for (Book book : cart) {
                totalPrice += book.getPrice();
            }
            if (discount != null) { // Apply discount if available
                double discountAmount = discount.calculateDiscount(totalPrice);
                totalPrice -= discountAmount;
                System.out.println("Discount applied: $" + discountAmount);
            }

            System.out.println("Total Price of books in cart: $" + totalPrice);
        }


    }
    // Method to view the books in the cart
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            double totalPrice = 0;
            System.out.println("Books in your cart:");
            for (Book book : cart) {
                System.out.println(book.getTitle() + " - $" + book.getPrice());
                totalPrice += book.getPrice();
            }
            System.out.println(" Total items in cart :"+" - $" + totalPrice);
        }
    }

    // Method to checkout (display total price and clear the cart)
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Add some books before checkout.");
        } else {
            System.out.println("Books in your cart:");
            showTotalPrice();
            cart.clear(); // Clear the cart after checkout
            System.out.println("Thank you for your purchase!");
        }
    }
}

