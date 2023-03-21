import java.util.*;
public class Find_missing_no 
{
     static int[] sort(int[] arr)
         {
            int temp;
            for (int i = 0; i < arr.length; i++) {     
                for (int j = i+1; j < arr.length; j++) {     
                   if(arr[i] > arr[j]) {    
                       temp = arr[i];    
                       arr[i] = arr[j];    
                       arr[j] = temp;    
                   }     
                }     
            }    
            return arr;
         }

         static int check(int[] arr)
         {
            boolean t=false;
             int t1=0;
             int t2=0;
            for(int i=1;i<=arr.length;i++)
            { 
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j]==i)
                    {
                         t=true;
                    }
                }
                if(t==false)
                {
                   t1++;
                   if(t1==1)
                   {
                       t2=i;
                   }
                       
                }
            }
            if(t1<2)
            {
                if(t1>0)
                   return t2;
                else
                   return -1;
            }
            else
              return -2;
         }
    public static void main(String[] args) {
    
        

         Scanner sc=new Scanner(System.in);
         System.out.println("enter the range of array: ");
         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("enter the element of array: ");
         for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
         }
         sort(arr);
         
         int ch=check(arr);
         if(ch==-1)
              System.out.println("No missing elemen");
         else if(ch==-2)
              System.out.println("More than two element missing");
        else
              System.out.println("missing no.: "+ch);
    }
}
