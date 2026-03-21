

public class student{
	private static int count =1001;
	private int studentId;
	private String studentName;
	private String courseName;
	private double fees;
	
	public student(int studentId, String studentName, String courseName, double fees) {
		this.studentId = count++;
		this.studentName = studentName;
		this.courseName = courseName;
		this.fees = fees;
	}
	
	public int getstudentId() { return this.studentId;}
	public String getstudentName() { return this.studentName;}
	public String getcourseName() { return this.courseName;}
	public double getfees() {return this.fees;}
	
	public void setstudentName(String studentName) { this.studentName=studentName;}
	public void setcourseName(String courseName) { this.courseName=courseName;}
	public void setfees(double fees) { this.fees=fees;}

	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", courseName=" + courseName
				+ ", fees=" + fees + "]";
	}
}
