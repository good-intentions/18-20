package simeon;

public class Checking extends Account {
	private int overdraftLimit;
	
	Checking(){
		setId(0);
		setBalance(0);
		this.overdraftLimit = (int) (getBalance() + 1000);
	}
	Checking(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
		this.overdraftLimit = (int) (getBalance() + 1000);
	}
	
	public void withdraw(double sumToWithdraw){
		if(sumToWithdraw <= 0 || overdraftLimit < sumToWithdraw){
			System.out.println("Error");
			return;
		}
		setBalance(getBalance()-sumToWithdraw);
		this.overdraftLimit -= sumToWithdraw;
	}
	
	public int getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public String toString() {
		return super.toString() + " " + this.overdraftLimit;
	}

}
