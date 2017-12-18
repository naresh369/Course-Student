
public class TestAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			Student s= new Student("naresh", 2345654, Gender.Male, "69 monarch dr", "naresh123@gmail.com");
			
			Course [] co= new Course[3];
			
			co[0]= new Course("physics", "C342", "Science Dept");
			co[1]= new Course("Java", "C567", "Computer Science Dept");
			co[2]= new Course("Arithemetics", "C890", "Mathematics Dept");
			
			//s.course=co;
			 s.getCourse();
	         
			System.out.println(s.getStudentName());
			System.out.println(s.getStudentId());
			System.out.println(s.getGender());
			System.out.println(s.getEmail());
			System.out.println(s.getAddress());
			System.out.println(s.getCourse());
			
			
			
		}

		
		
		
	}


