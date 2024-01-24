package org.example.inheritance.classChallange;

public class Main {
    public static void  main (String args[]){
        BankAccount account = new BankAccount();
        account.setAccountBalance(10);
        account.setAccountNumber(1);
        account.setEmail("yahoo.com");
        account.setPhoneNumber("+37672892");
        account.setCustomerName("jozsi");
        System.out.println(account.getAccountBalance()+ " "+
                account.getAccountNumber()+" "+
                account.getPhoneNumber()+" "+
                account.getEmail()+" "+
                account.getCustomerName());
        account.withdrawFounds(100 );
        System.out.println(account.getAccountBalance());
    }
}
