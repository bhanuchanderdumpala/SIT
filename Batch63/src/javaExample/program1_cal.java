package javaExample;

public class program1_cal {
	public void add(int a, int b)
	{
		
		int result=a+b;
		 System.out.println("Addition = " + result);
	}
	
	public void mul(int a, int b)
	{
		
		int result=a*b;
		 System.out.println("Multipication = " + result);
	}
	public void sub(int a , int b )
	{
		
		int result=a-b;
		 System.out.println("Multipication = " + result);
	}
	
	public static void main(String[] args)
	{
		program1_cal addition=new program1_cal();
		addition.add(10,20);
		addition.mul(10,20);
		addition.sub(70,20);
		
	}
	
	
	

}
