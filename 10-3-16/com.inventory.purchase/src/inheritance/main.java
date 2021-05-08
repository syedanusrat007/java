package inheritance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawable obj=new circle();
		obj.open();
		obj.draw();
		obj.close();
		
		 obj=new rectangle();
		obj.open();
		obj.draw();
		obj.close();
		
		 obj=new oval();
		obj.open();
		obj.draw();
		obj.close();

	}

}
