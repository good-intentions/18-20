package simeon;

public class PersonTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Pesho", "123Strasse", 555678543 , "pesho@memail.org");
		System.out.println(p1.toString());
		
		StudentP p2 = new StudentP("Pesho", "123Strasse", 555678543 , "pesho@memail.org", "freshman");
		System.out.println(p2.toString());
		
		Employee p3 = new Employee("Pesho", "123Strasse", 555678543 , "pesho@memail.org", "Gorna Banq", 1250);
		System.out.println(p3.toString());
		
		Faculty p4 = new Faculty("Pesho", "123Strasse", 555678543 , "pesho@memail.org", "Gorna Banq", 1250, "chairman", "8:00-17:00");
		System.out.println(p4.toString());
		
		Staff p5 = new Staff("Pesho", "123Strasse", 555678543 , "pesho@memail.org", "Gorna Banq", 1250, "prince");
		System.out.println(p5.toString());
		

	}
	
}
