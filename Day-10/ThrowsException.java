class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank {
    private double balance;

    void deposit(int amount) throws InsufficientBalanceException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new InsufficientBalanceException("Amount can't be 0 or negative");
        }
    }

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Invalid withdrawal amount");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
        }
    }

    void getBalance() {
        System.out.println("Balance is " + balance);
    }
}

public class ThrowsException {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.deposit(1000);
            b.getBalance();
            b.withdraw(500);
            b.getBalance();
            b.withdraw(600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}