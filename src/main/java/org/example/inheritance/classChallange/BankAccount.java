package org.example.inheritance.classChallange;

public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public void depositFounds(int money){
        accountBalance += money;
        System.out.println("Deposit: " + money + "New balance: " + this.accountBalance);

    }
    public void withdrawFounds(int withdrawal){
        if(accountBalance - withdrawal < 0){
            System.out.println("you cannot withdraw money");
        } else{
            accountBalance -= withdrawal;
            System.out.println("withdraw: "+ withdrawal + "Balance: " + accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
