
public class Inefficientbalance 
{
public static void main(String[] args) {
	class InsufficientBalanceException extends Exception {
	    private int requiredAmount;

	    public InsufficientBalanceException(int requiredAmount) {
	        this.requiredAmount = requiredAmount;
	    }

	    public String getMessage() {
	        return "Sorry, insufficient balance, you need more " + requiredAmount + " Rs. to perform this transaction.";
	    }
	}

	class Account {
	    private int balance = 2000;

	    public void withdraw(int amount) throws InsufficientBalanceException {
	        if (amount > balance) {
	            throw new InsufficientBalanceException(amount - balance);
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful! Remaining balance: " + balance);
	        }
	    }
	}

	class TestCustomException {
	    public static void main(String[] args) {
	        Account account = new Account();
	        int withdrawAmount = 2500;

	        try {
	            account.withdraw(withdrawAmount);
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
}
}
