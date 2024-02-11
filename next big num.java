import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan= new Scanner(System.in);
	    System.out.print("enter the array size:");
	    Integer n=scan.nextInt();
	    System.out.print("enter the elements of the array:");
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=scan.nextInt();
	    }
	    System.out.print("enter a number to find the next big number:");
	    Integer num=scan.nextInt();
	    Arrays.sort(arr);
	    int j=0;
	    while(j<n)
	    {
    	    if(arr[j]==num)
    	    {
    	        System.out.println("the next big number of "+num+" is "+ arr[j+1]);
    	    }
    	    j++;
     	}
	
	    
	    
	}
}

output:

enter the array size:5
enter the elements of the array: 9 1 4 2 3
enter a number to find the next big number:2
the next big number of 2 is 3