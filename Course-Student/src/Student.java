
public class Student {

	private String studentName;			
	private int studentId;
	private Gender gender;
	private String address;
	private String email;
	
	public Course [] course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, int studentId, Gender gender, String address, String email) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.gender = gender;
		this.address = address;
		this.email = email;
	}

	
	

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
	
	
	
	
}
