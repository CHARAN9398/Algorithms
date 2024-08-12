package array;

public class primenumber {
    public static void main(String args[]) {
        int num = 12;
        boolean result = isPrime(num);
        System.out.println(result);
    }
    static boolean isPrime(int num)
    {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) 
            {
                return false; 
            }
        }
        return true;
    }
}
