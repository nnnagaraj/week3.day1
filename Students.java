package week3.day1.assignments;

public class Students {
	
	public static void getStudentInfo(int id) {
		System.out.println("Student Info: " +id);
	}
	public static void getStudentInfo(int id, String name) {
		System.out.println("Student Info: " +id+ "," +name);
	}
	public static void getStudentInfo(String email, long Phone) {
		System.out.println("Student Info: " +email+ "," +Phone);
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(501);
		stud.getStudentInfo(601, "Nagaraj Nagendran");
		stud.getStudentInfo("nnnagaraj@gmail.com", 9884301638L);
	}

}
