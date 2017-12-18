
public class Course {

	String courseName;
	String courseNum;
	String Dept;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(String courseName, String courseNum, String dept) {
		super();
		this.courseName = courseName;
		this.courseNum = courseNum;
		Dept = dept;
	}


	public String getCourseName() {
		
		
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseNum() {
		return courseNum;
	}


	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}


	public String getDept() {
		return Dept;
	}


	public void setDept(String dept) {
		Dept = dept;
	}
	
		
}
