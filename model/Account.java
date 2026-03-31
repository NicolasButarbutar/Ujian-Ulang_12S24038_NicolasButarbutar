package model;

/**
 * @author 12S24038 Nicolas J Grace Butarbutar
 */

public class Account {
    private String owner;
    private String accountName;
    private double balance;
    private String type;

    public Account(String _owner, String _accountName, String _type){
        this.owner = _owner;
        this.accountName = _accountName;
        this.balance = 0.0;
        this.type = _type;
    }

    // Default
    public Account(){
        this.owner = "";
        this.accountName = "";
        this.balance = 0.0;
        this.type = "";
    }

    public String getOwner(){
        return owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public String getType(){
        return type;
    }

    public void addTransaction(double _amount){
        this.balance += _amount;
    }
    
    @Override
    public String toString(){
        return accountName + "|" + owner + "|" + type + "|" + balance;
    }
}