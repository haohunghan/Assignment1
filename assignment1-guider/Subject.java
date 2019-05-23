public class Subject implements SubjectInterface {
	
	private String studentID;
	private String subjectName;
	private double grade;
	
	public Subject() {
		setGrade(0);
		setStudentID("");
		setSubjectName("");
	}
	public Subject(String id, String name, double grade) {
		setGrade(grade);
		setStudentID(id);
		setSubjectName(name);
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public String getSubjectName() {
		return subjectName;
	} 
	
	public double getGrade() {
		return grade;
	} 
	
	public void setStudentID(String id) {
		this.studentID=id;
	}
	
	public void setSubjectName(String name) {
		this.subjectName=name;
	} 
	
	public void setGrade(double grade) {
		this.grade=grade;
	} 
	
	public String toString() {
		return (studentID + "\n" + subjectName+" "+ grade);
	}
}