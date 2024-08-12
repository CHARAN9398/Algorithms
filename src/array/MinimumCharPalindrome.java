package array;
public class MinimumCharPalindrome
{
	public static void main(String args[])
	{
		String a = "ABCC";
		System.out.println(chardelete(a));
	}
	static boolean palindrome(String a)
	{
		int l = 0;
		int h = a.length()-1;
		while(h>0)
		{
			if(a.charAt(l++) != a.charAt(h--))
			{
				return false;
			}
		}
		return true;
	}
	static int chardelete(String a)
	{
		int count = 0;
		while(a.length()>0 && !palindrome(a))
		{
			count++;
			a = a.substring(0,a.length()-1);
		}
		return count;
	}
}
