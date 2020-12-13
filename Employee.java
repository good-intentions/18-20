package simeon;

public class Employee extends Person {
     private String office;
     private java.util.Date dateHired;
     private int salary;
     
     Employee(){
    	 this.dateHired = new java.util.Date();
     }
     Employee(String name, String address, int phoneNumber, String eMail, String office, int salary){
 		this.setName(name);
 		this.setAddress(address);
 		this.setPhoneNumber(phoneNumber);
 		this.seteMail(eMail);
 		this.setOffice(office);
 		this.setSalary(salary);
 		this.dateHired = new java.util.Date();
     }
     
     public String toString() {
    	 return super.toString() + this.office + " " + this.salary + " " + this.dateHired;
     }

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public java.util.Date getDateHired() {
		return dateHired;
	}
     
     
     
}
