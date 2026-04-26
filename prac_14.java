class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
    }

    void checkBalance() {
        System.out.println(balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance * Math.pow(1.07, years);
    }
}

class TestBank {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.openAccount(1, "A", 10000);
        s.deposit(2000);
        s.checkBalance();
        System.out.println(s.calculateInterest());

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(2, "B", 15000);
        System.out.println(f.maturityAmount(2));
    }
}