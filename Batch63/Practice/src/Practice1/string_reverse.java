package Practice1;

public class string_reverse {
	
	public static void main(String args[])
	{
		String S="Hello how are you";
				
		String reverse="";
		
		System.out.println("The given string is :: "+ S);
		for(int i=S.length ()-1;i>0;i--) {
			reverse=reverse+ S.charAt(i);}
	
        
		
		System.out.println("The given string is reverse order ::"+reverse);
		System.out.println("The given string is reverse order ::"+S.charAt(7));
	}

}
