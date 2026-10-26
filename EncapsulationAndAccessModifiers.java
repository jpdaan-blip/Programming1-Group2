class BankAccount {
    private String accountHolder;
    private double balance;

        public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

        public double getBalance() {
        return balance;
    }

        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: ₱" + amount);
        } else {
            System.out.println("Invalid deposit. Amount must be positive.");
        }
    }

        public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal. Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Invalid withdrawal. Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: ₱" + amount);
        }
    }

        public void displayAccountInformation() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₱" + balance);
    }
}

    public class EncapsulationAndAccessModifiers {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jimwell Daan", 1000.00);

        account.displayAccountInformation();
        System.out.println();

        account.deposit(500.00);
        account.withdraw(200.00);

        account.deposit(-100.00);
        account.withdraw(-50.00);
        account.withdraw(2000.00);

        System.out.println();
        System.out.println("Final Balance: ₱" + account.getBalance());
    }
}
