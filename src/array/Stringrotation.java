package array;
public class Stringrotation
{
	public static void main(String args[])
	{
	 String a = "aaaaaaaa";
	 boolean result = rotationstring(a);
	 System.out.println(result?1:0);
	}
	static boolean palindrome(String a)
	{
		int l = 0;
		int h = a.length()-1;
		while(h>l)
		{
			if(a.charAt(l++) != a.charAt(h--))
			{
				return false;
			}
		}
		return true;
	}
	static boolean rotationstring(String a)//abb
	{
		int length = a.length();
		for(int i =0; i<length;i++)
		{
			String str1 = a.substring(i+1); //(0+1 = 1) / bb, ba
			String str2 = a.substring(0,i+1); //(0,0+1 = 0,1 = "a") /a, b
			String rotated = str1+str2; //bba, bab, 
			if(palindrome(rotated))
			{
				return true;
			}
		}
		return false;
	}
	
}
