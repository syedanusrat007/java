package wotr;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     int x=0;
     int y=10;
     try{
     int z=y/2;
     }catch(Exception e)
     {
    	 e.printStackTrace();
     }
     finally
     {
    	 System.out.println("finally");
     }
     //Thread.sleep(1000);
     System.out.println("hi");
	}

}
