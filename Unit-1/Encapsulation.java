class Account {
  public int balance = 0;
}

class Transaction {
  Account sourceAccount;
  Account destinationAccount;

  Transaction(Account sourceAccount, Account destinationAccount) {
    this.sourceAccount = sourceAccount;
    this.destinationAccount = destinationAccount;
  }

  void transfer(int amount) {
    sourceAccount.balance -= amount;
    destinationAccount.balance += amount;
  }
}

class Encapsulation {
  public static void main(String[] args){
    Account sourceAccount = new Account();
    Account destinationAccount = new Account();

    sourceAccount.balance = 500;
    destinationAccount.balance = 750;

    Transaction t = new Transaction(sourceAccount, destinationAccount);
    t.transfer(250);

    System.out.println(sourceAccount.balance);
    System.out.println(destinationAccount.balance);
  }
}
