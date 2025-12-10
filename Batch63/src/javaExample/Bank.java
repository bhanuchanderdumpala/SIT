package javaExample;
import java.util.Scanner;

class Bank {

    int balance = 100;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful: " + amount);
        
        System.out.println("Updated Balance = " + balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
    }

    public void checkBalance() {
        System.out.println("Finally your Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        

        b.deposit(depositAmount);
        System.out.println("Deposit successful!");
        System.out.println("Enter amount to Withdraw: ");
        int withdrawAmount=sc.nextInt();
        b.withdraw(withdrawAmount);
        b.checkBalance();
        
        
    }
}
