package simeon;

public class Saving extends Account {
	
	Saving(){
		setId(0);
		setBalance(0);
	
	}
	Saving(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	}
	public void withdraw(double sumToWithdraw){
		if(sumToWithdraw <= 0){
			System.out.println("Error");
			return;
		}else if(getBalance() < sumToWithdraw) {
			System.out.println("Not enough money");
			return;
		}
		setBalance(getBalance() - sumToWithdraw);
	}

}
