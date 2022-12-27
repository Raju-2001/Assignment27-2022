package Assignment;

public class Automation extends MultipleLanguage implements Language,TestTool {
	
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
		
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("seleniums");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	}
	 

}
