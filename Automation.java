package week3.day1.assignments;

public class Automation implements Language, TestTool {

	public void Selenium() {
		// TODO Auto-generated method stub
		this.testingtool();
		System.out.println("Testing Tool: " +name);
	}

	public void Java() {
		// TODO Auto-generated method stub
		String name = "Python";
		System.out.println("Language: " + name);
		//this.Java();
		}
	
	final static void language() {
		String lang = ".Net";
		System.out.println("Language detail as in Interface: " + lang);
	
	}
	
	public static void testingtool() {
		String name = "Ignite";
		System.out.println("Testing Tool detail as in Interface: " + name);
	}

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.language();
		auto.testingtool();
	}
}
