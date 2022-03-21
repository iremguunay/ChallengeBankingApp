public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Irem", 50000);

        bankAccount.withdraw(3000);
        bankAccount.deposit(10000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

    }
}
