package xyz;

public class ExceptionEg {

	static void hello() throws Exception{
		int n=5;
		n/=n-n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				hello();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Enter a value");
			}
		
		
		
	}

}
