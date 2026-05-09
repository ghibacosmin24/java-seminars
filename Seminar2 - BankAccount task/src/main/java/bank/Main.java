package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Razvan", 1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}