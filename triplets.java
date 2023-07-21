import java.util.*;
class triplets 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i, j, k, sum, temp, count = 0;
        for (i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) 
            { 
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (i = 0; i < n - 1; i++) 
        {
            for (j = i + 1; j < n; j++) 
            {
                sum = arr[i] + arr[j];
                for (k = 0; k < n; k++) 
                { 
                    if (arr[k] == sum) 
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}