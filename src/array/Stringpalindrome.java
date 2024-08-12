package array;

public class Stringpalindrome {

	public static void main(String args[])
	{
		String a = "racecar";
		boolean result = ispalindrome(a);
		System.out.println(result);
	}
	public static boolean ispalindrome(String a)
	{
		int i = 0;
		int j = a.length()-1;
		while(i<j)
		{
			if(a.charAt(i) != a.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
