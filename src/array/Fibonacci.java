package array;

public class Fibonacci {
	public static void main(String args[])
	{
		int firstnum = 0;
		int secondnum = 1;
		int thirdnum = 0;
		for(int i = 2; i<10;i++)
		{
			thirdnum = firstnum + secondnum;
			System.out.println(thirdnum);
			firstnum = secondnum;
			secondnum = thirdnum;
		}
		
	}
}
