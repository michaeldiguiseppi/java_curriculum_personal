public class Transfer {
  Account sourceAccount;
  Account destinationAccount;

  Transfer(Account sourceAccount, Account destinationAccount) {
    this.sourceAccount = sourceAccount;
    this.destinationAccount = destinationAccount;
  }

  void transfer(int amount) {
    sourceAccount.balance -= amount;
    destinationAccount.balance += amount;
  }
}
