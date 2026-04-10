package basicPart1;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 29;
		int count =0;
		while (num>0)
		{
			
			if(num%2==0)
				
			{
				System.out.println("NUmber is prime");
			}
			else
				
			{
				System.out.println("number is not prime");
			}
			num= num/10;
		}
	}

}

