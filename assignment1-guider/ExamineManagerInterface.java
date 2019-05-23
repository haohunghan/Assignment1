public interface ExamineManagerInterface {
	public void importStudentData(String filename); // get students' information from a data file
	public void importGradeData(String filename); // get subject and grades from a data file 
	
	public void computeAverageGrades(); // compute average grade for each student 
	public void sortStudentsbyGrades(); // sort students by average grades
	public void writeResults2File(String filename); // save final results to a file 
		
}