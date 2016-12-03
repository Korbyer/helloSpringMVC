package kr.ac.hansung.model;

public class Lectures {
	private int year;
	private int semester;
	private String lecturecode;
	private String lecturename;
	private String lecturekind;
	private int credits;
	public Lectures(){
		
	}
	public Lectures(int year, int semester, String lecturecode, String lecturename, String lecturekind, int credits) {
		this.year=year;
		this.semester=semester;
		this.lecturecode=lecturecode;
		this.lecturekind=lecturekind;
		this.lecturename=lecturename;
		this.credits=credits;
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return " "+year+" "+semester+" "+lecturecode+" "+lecturekind+" "+lecturename+" "+credits+" ";
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getLecturecode() {
		return lecturecode;
	}
	public void setLecturecode(String lecturecode) {
		this.lecturecode = lecturecode;
	}
	public String getLecturename() {
		return lecturename;
	}
	public void setLecturename(String lecturename) {
		this.lecturename = lecturename;
	}
	public String getLecturekind() {
		return lecturekind;
	}
	public void setLecturekind(String lecturekind) {
		this.lecturekind = lecturekind;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	

}
