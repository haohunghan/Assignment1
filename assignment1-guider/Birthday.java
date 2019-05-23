import java.util.*;
public class Birthday {
	private int day;
	private int month;
	private int year;
	
	public Birthday() {
		day = 0;
		month = 0; 
		year = 0;
	}
	public Birthday(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year; 
	}
	public Birthday(String formated_input) {
		// for example, input = "19/10/1999"
		String[] words = formated_input.split("/");
		day = Integer.parseInt(words[0]);
		month = Integer.parseInt(words[1]);
		year = Integer.parseInt(words[2]);
		
	}
	
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}
	public void setDay(int day) {this.day = day;}
	public void setMonth(int month) {this.month = month;}
	public void setYear(int year) {this.year = year;}
	
	public String getStringBirthday() {
		return day+"/"+month+"/"+year;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	public boolean equals(Birthday x) {
		return day==x.day && month==x.month && year==x.year; 
	}
	
	//========================================================
	// for test
	public static void main(String[] args) {
		Birthday x = new Birthday("19/10/2006");
		Birthday y = new Birthday("19/10/2006");
		Birthday z = new Birthday("19/10/2007");
		System.out.println(x);
		
		if(x.equals(y)) System.out.println(x+" = "+y);
		if(!x.equals(z)) System.out.println(x+" != "+z);
		
	}
	
}




