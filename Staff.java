package simeon;

public class Staff extends Employee {
	private String title;
	
	Staff(String name, String address, int phoneNumber, String eMail, String office, int salary, String title){
 		this.setName(name);
 		this.setAddress(address);
 		this.setPhoneNumber(phoneNumber);
 		this.seteMail(eMail);
 		this.setOffice(office);
 		this.setSalary(salary);
 		this.setTitle(title);
 		
     }
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString()  + " " + this.title;
	}

}
