package simeon;

public class SavingsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Account.setYearInterestRate(0.1);
		Checking.setYearInterestRate(0.2);
		
		Account a1 = new Account( 1, 350);
		System.out.println(a1.toString());
		
		
		
		Checking a2 = new Checking( 2, 750.75);
		System.out.println(a2.toString());
		
		Saving a3 = new Saving( 3, 80000);
		System.out.println(a3.toString());

	}

}
