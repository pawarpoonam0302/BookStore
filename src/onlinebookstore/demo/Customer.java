package onlinebookstore.demo;

public class Customer {
    private String name;
    private int customerId;
    private String email;

    // Constructor
    public Customer(String name, int customerId, String email) {
        this.name = name;
        this.customerId = customerId;
        this.email = email;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to display customer details
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }





}
