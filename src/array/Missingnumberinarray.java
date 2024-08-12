package array;

public class Missingnumberinarray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,5};
		int length = a.length+1;
		int firstnum = (a[0] + a[a.length-1]) * length /2;//12
		int secondnum = 0;
		for(int i = 0; i<a.length;i++)
		{
			secondnum = secondnum + a[i];
		}
		int thirdnum = firstnum - secondnum;
		System.out.println(thirdnum);
	
	}
	

}
