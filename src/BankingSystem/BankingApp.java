package BankingSystem;

public class BankingApp {
    public static void main(String[] args){

    }
}

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    void deposit(int amount){
        if(amount !=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount !=0){
            balance = balance + amount;
            previousTransaction = - amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn: " + previousTransaction);
        }
    }
}