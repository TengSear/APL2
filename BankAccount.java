class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
      super(message);
    }
  }
  
  public class BankAccount {
    private double balance;
  
    public BankAccount(double balance) {
      this.balance = balance;
    }
  
    // Method to deposit money
    public void deposit(double amount) {
      if (amount > 0) {
        balance += amount;
      }
    }
  
    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
      if (amount > balance) {
        throw new InsufficientFundsException("Insufficient funds for this withdrawal");
      }
      balance -= amount;
    }
  
    // Method to get the current balance
    public double getBalance() {
      return balance;
    }
  
    /**
     * @param args
     */
    public static void main(String[] args) {
      // Create a BankAccount object
      BankAccount account = new BankAccount(1000.0);
  
      // Deposit money
      account.deposit(500.0);
      System.out.println("Current balance after deposit: " + account.getBalance());
  
      // Attempt to withdraw money
    class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
      super(message);
    }
  }
  
  public class BankAccount {
    private double balance;
  
    public BankAccount(double balance) {
      this.balance = balance;
    }
  
    // Method to deposit money
    public void deposit(double amount) {
      if (amount > 0) {
        balance += amount;
      }
    }
  
    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
      if (amount > balance) {
                                 try {
        account.withdraw(2000.0);
      } catch (InsufficientFundsException e) {
        System.out.println("Exception caught: " + e.getMessage());
      }
  
      // Check balance after attempted withdrawal
      System.out.println("Current balance after attempted withdrawal: " + account.getBalance());
  
      // Successful withdraw
      try {
        account.withdraw(300.0);
        System.out.println("Withdrawal successful.");
      } catch (InsufficientFundsException e) {
        System.out.println("Exception caught: " + e.getMessage());
      }
  
      // Final balance
      System.out.println("Final balance: " + account.getBalance());
    }
   }
               