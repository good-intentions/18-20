package simeon;

public class Faculty extends Employee {
	private String rank;
	private String officeHours;
	
		
	Faculty(String name, String address, int phoneNumber, String eMail, String office, int salary, String rank, String officeHours){
 		this.setName(name);
 		this.setAddress(address);
 		this.setPhoneNumber(phoneNumber);
 		this.seteMail(eMail);
 		this.setOffice(office);
 		this.setSalary(salary);
 		this.setRank(rank);
 		this.setOfficeHours(officeHours);
    }
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String toString() {
		return super.toString() + " " + this.rank + " " + this.officeHours;
	}

}
