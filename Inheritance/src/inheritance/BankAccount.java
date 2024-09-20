/*Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account 
 * balance falls below one hundred.*/
package inheritance;
public class BankAccount {
    double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        System.out.println("Balance: " + savingsAccount.balance);
        savingsAccount.withdraw(400.0);
        System.out.println("Balance: " + savingsAccount.balance);
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw " + amount + ". Balance would fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}
