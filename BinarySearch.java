#BinarySearch

import java.util.Scanner;
public class BinarySearch 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt(); // elemnt to be searched  
        sc.close();
        System.out.println(BinSer(n, a, x));  
      }
      static int BinSer(int n, int [] a, int x)
      {
        int low=0, high=n-1;
       while(low<high)
       {
        int mid=(low+high)/2;
        if(a[mid]==x)
        {
            return mid;
        }
        else if(x>a[mid])
        {
            low=mid+1;
        }
        else 
        {
            high=mid-1;
        }
       }
        return -1;
      }
}
