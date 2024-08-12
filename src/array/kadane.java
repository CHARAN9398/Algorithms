package array;
public class kadane 
{
    public static void main(String[] args)
    {
        int[] a = { 18, -3, 4, -1, -2, 1, 5, 17 };
        System.out.println("max contiguous sum: "+ maxSubArraySum(a));
    }
   static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE; //-2147483648
        int max_ending_here = 0;
        for (int i = 0; i < size; i++) 
        {
            max_ending_here = max_ending_here + a[i];
            
            if (max_so_far < max_ending_here) // -23232323232<-2, -2<-3, -2<4, 3, 1, 2, 7
                max_so_far = max_ending_here;// -2 , -2, 4, 4, 4, 4, 7 
            
            if (max_ending_here < 0)//-2, 4, 7 
                max_ending_here = 0;//
        }
        return max_so_far;
    }
}
