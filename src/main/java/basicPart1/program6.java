package basicPart1;

public class program6 {

	public static void main(String[] args) {
		String str="welcome to india";
		String rev="";
		for(int i=str.length()-1;i>=0;i++)
		{
			rev= rev+ str.charAt(i);
			
			
		}
		System.out.println(rev);
		
		
		for(int j=0;j<=rev.length();j++)
		{
			char c= rev.charAt(j);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c + " ");
			
		}
		

	}

}
}