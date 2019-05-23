public class Person {
	protected String name;
	public Birthday birthday;
	
	public Person() {
		birthday = new Birthday();
		name ="";
	}
	public Person(String name, String birthday_formated) {
		birthday = new Birthday(birthday_formated);
		this.name = name;
	}
	public String getName() {return name;}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStringBirthday() {
		return birthday.getStringBirthday();
	}
	public void setBirthday(String birthday_formated) {
		birthday = new Birthday(birthday_formated);
	}
	
	public String toString() {
		return name+" : " + birthday.toString();
	}
	
	//============================================
	// for test
	public static void main(String[] args) {
		String date = "19/10/1999";
		String name = "Nguyen Van A";
		
		Person x = new Person(name,date);
		System.out.println(x);
	}
}