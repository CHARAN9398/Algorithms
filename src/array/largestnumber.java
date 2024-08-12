package array;

public class largestnumber 
{
	public static void main(String args[])
	{
		int a[] = {12,3,45,2,9,57,96};
		System.out.println(test(a));
	}
	public static int test(int a[])
	{
		 int max = a[0];
		 for(int i = 1; i<a.length;i++)
		 {
			 if(a[i] > max)
			 {
				 max=a[i];
			 }
		 }
		 return max;
	}
}
