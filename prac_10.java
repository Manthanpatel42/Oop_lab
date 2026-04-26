class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * interest_rate / 100;
    }

    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    public static void main(String[] args) {
        BankAccount.updateInterestRate(5);

        BankAccount a1 = new BankAccount("Manthan", 10000);
        BankAccount a2 = new BankAccount("Rahul", 20000);

        a1.display();
        a2.display();
    }
}