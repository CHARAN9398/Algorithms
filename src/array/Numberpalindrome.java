package array;

public class Numberpalindrome {
	public static void main(String args[])
	{
		int n = 121;
		int r = 0;
		int temp;
		int sum= 0;
		temp = n;
		while(n>0)
		{
			r = n % 10;
			sum = (sum * 10)+r;
			n = n/ 10;
		}
		if(temp == sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
