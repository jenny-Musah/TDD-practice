public class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0 ) balance = balance + amount;
    }

    public void withdraw(int amount){
        if(amount < balance && amount > 0) {
                balance = balance - amount;
        }
        else System.out.println("Amount to withdraw is greater than your balance");
    }

    public int getBalance() {
        return balance;
    }
}
