public class Student extends Person implements StudentInterface, Comparable<Student> {
	private String studentID; 
	private double average_grade; 
	
	public Student() {
	super();
	setStudentID("  ");
	}
	public Student(String name, String formattedBirthday, String studentID) {
		super();
		setStudentID(studentID);
		
	}
	
	
	//public String getName(); from Person class 
	//public String getStringBirthday(); from Person class 
	public String getStudentID() {
		return studentID;
	}
	public double getAverageGrade() {
		return average_grade;
	}
	
	//public void setName(String name); from Person class
	//public void setBirthday(String formattedBirthday); from Person class
	public void setStudentID(String studentID) {
		this.studentID=studentID;
	} 
	public void setAverageGrade(double average_grade) {
		this.average_grade=average_grade;
	}
	
	public String toString() {
		return super.name+"\n"+super.birthday+"\n"+studentID;
	}
	
	public int compareTo(Student x) {
		int a=2;
		if(this.getAverageGrade()>x.getAverageGrade()){
			a= 1;	
		}
		if(this.getAverageGrade()<x.getAverageGrade()){
			a= -1;	
		}
		if(this.getAverageGrade()==x.getAverageGrade()){
			a= 0;
		}
		return a;
	}
}


