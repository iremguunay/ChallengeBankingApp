public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double withdrawAmount) {
        if(withdrawAmount <= this.balance) {
            this.balance = this.balance - withdrawAmount;
            return this.balance;
        }
        return 0;
    }

    public double deposit(double depositAmount) {
        if(depositAmount > 0) {
            this.balance = this.balance + depositAmount;
            return this.balance;
        }
        return 0;
    }
}
