import java.util.*;
import java.io.*;
public class TestAssignment1 {
	public static void main(String[] args) throws Exception {
		/*String studentFileName = args[0];
		String gradeFileName = args[1]; 
		String resultFileName = args[2]; 
		*/
		String studentFileName = "students.data";
		String gradeFileName = "grades.data"; 
		String resultFileName = "summary.data";
		
		ExamineManager manager = new ExamineManager(); 
		manager.importStudentData(studentFileName);
		manager.importGradeData(gradeFileName);
		manager.computeAverageGrades();
		manager.sortStudentsbyGrades();
		manager.show();
		manager.writeResults2File(resultFileName);
	}

}