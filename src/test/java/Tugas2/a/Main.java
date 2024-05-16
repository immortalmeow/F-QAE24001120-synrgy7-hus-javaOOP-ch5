package Tugas2.a;


public class Main {
    public static void main(String[] args) {
        // Membuat instance dari BankAccount
        BankAccount account = new BankAccount("555666", 3000, "Kobra Hitam", "kobrahitamb@hmail.com", "6282138684767");

        // Mencoba getter
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Customer Email: " + account.getCustomerEmail());
        System.out.println("Customer Phone: " + account.getCustomerPhone());

        // Melakukan deposit sebanyak $500
        account.deposit(500.0);

        // Melakukan withdraw sebanyak $1000
        account.withdraw(1000);

        // Mencoba withdraw dengan jumlah yang melebihi saldo user
        account.withdraw(5000.0);
    }
}
