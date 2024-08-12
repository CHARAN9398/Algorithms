package array;
public class FindMissingNumber 
{
    public static void main(String[] args) 
    {
        int array[] = {1, 2, 3, 4, 6}; 
        int lengthsum = array.length + 1;
        int firstsum = (array[0] + array[array.length - 1]) * lengthsum / 2; //18*5 = 90/2 = 45
        int secondsum = 0;
        for (int i = 0;i<array.length;i++) 
        {
            secondsum = secondsum + array[i]; //35
        }
        int missingnumber = firstsum - secondsum;
        System.out.println("missingnumber is : "+missingnumber);
    }
}