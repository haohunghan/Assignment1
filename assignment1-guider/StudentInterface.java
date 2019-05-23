public interface StudentInterface {
	public String getName();
	public String getStringBirthday();
	public String getStudentID(); 
	public double getAverageGrade();
	
	public void setName(String name);
	public void setBirthday(String formattedBirthday);
	public void setStudentID(String studentID); 
	public void setAverageGrade(double average_grade);
}