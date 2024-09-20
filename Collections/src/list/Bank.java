/*Write a Java program to create a class called "Bank" with a collection of accounts and methods 
 * to add and remove accounts, and to deposit and withdraw money. 
 * Also define a class called "Account" to maintain account details of a particular customer*/
package list;

import java.util.*;

class Account {
    
    private String name;
    private String accno;
    private double balance;

    
    public Account(String name, String accno, double balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    
    public String getName() {
        return name;
    }

    public String getAccno() {
        return accno;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    
    public void displayAccount() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    
    private List<Account> accounts = new ArrayList<>();

    
    public void addAccount(Account account) {
        accounts.add(account);
    }

    
    public void removeAccount(String accno) {
        Account accountToRemove = null;
        for (Account acc : accounts) {
            if (acc.getAccno().equals(accno)) {
                accountToRemove = acc;
                break;
            }
        }
        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
            System.out.println("Account removed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    
    public void depositToAccount(String accno, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccno().equals(accno)) {
                acc.deposit(amount);
                System.out.println("Amount deposited successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    
    public void withdrawFromAccount(String accno, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccno().equals(accno)) {
                if (acc.withdraw(amount)) {
                    System.out.println("Amount withdrawn successfully.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("Enter 1 to add, 2 to remove, 3 to deposit, 4 to withdraw, 5 to display acc,6 to exit:");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Account No.:");
                    String accno = sc.nextLine();
                    System.out.println("Enter Balance:");
                    double balance = sc.nextDouble();
                    Account account = new Account(name, accno, balance);
                    bank.addAccount(account);
                    account.displayAccount();
                    break;
                case 2:
                    System.out.println("Enter Account No. to remove:");
                    String accnoToRemove = sc.nextLine();
                    bank.removeAccount(accnoToRemove);
                    break;
                case 3:
                    System.out.println("Enter Account No. to deposit:");
                    String accnoToDeposit = sc.nextLine();
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine(); 
                    bank.depositToAccount(accnoToDeposit, depositAmount);
                    break;
                case 4:
                    System.out.println("Enter Account No. to withdraw:");
                    String accnoToWithdraw = sc.nextLine();
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    sc.nextLine(); 
                    bank.withdrawFromAccount(accnoToWithdraw, withdrawAmount);
                    break;
                case 5:
                	System.out.println("Enter Account No. to display details:");
                    String accnoToDisplay = sc.nextLine();
                    boolean found = false;
                    for (Account acc : bank.accounts) {
                        if (acc.getAccno().equals(accnoToDisplay)) {
                            acc.displayAccount();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

