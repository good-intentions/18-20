package simeon;

public class StudentP extends Person {
	private String classStatus;
	
	StudentP(String name, String address, int phoneNumber, String eMail, String classStatus){
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
		this.seteMail(eMail);
		this.classStatus = classStatus;
	}
    public String toString() {
    	return super.toString() + this.classStatus ;
    }

	public String getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
}
