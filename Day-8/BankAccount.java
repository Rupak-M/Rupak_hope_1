class Bank{
     String name;
     String accountNumber;
     double balance;

    public Bank(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int deposit(double amount){
        balance += amount;
        return (int)balance;
    }
    public int withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance!");
            return (int)balance;
        }
        balance -= amount;
        return (int)balance;
    }
    public int getBalance(){
        return (int)balance;
    }

    public void display(){
        System.out.println("Account Holder Name: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: $" + this.balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Bank bankacc = new Bank("Sam Mathew", "7604954436", 1000.0);
        bankacc.display();
        System.out.println("Balance after deposit of $500: $" + bankacc.deposit(500.0));
        System.out.println("Balance after withdrawal of $200: $" + bankacc.withdraw(200.0));
        System.out.println("Balance after withdrawal of $1500: $" + bankacc.withdraw(1500.0));
        
    }
}
