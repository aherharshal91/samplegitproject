package basicPart1;


public class program2 {
    public static void main (String [] args)
    {
        String a = "Harshal Aher";
        String rev = "";
        for (int i= a.length()-1;i>=0;i--)
        {
            rev= rev + a.charAt(i);

            System.out.println(rev);
        }
    }
}
