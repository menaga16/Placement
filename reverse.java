import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scan= new Scanner(System.in);
	    System.out.println("enter a string: ");
	    String str=scan.nextLine();

        char[] arr=str.toCharArray();

        int left=0;
        int right=arr.length-1;
        
        while(left<=right) 
        {
            if (!Character.isLetterOrDigit(arr[left]))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(arr[right])) 
            {
                
                
                right--;
            } 
            
            else 
            {
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;            
                left++;
                right--;
            }
        }
        
        System.out.print(arr);
	    
	    
	}
}

output:

enter a string: 
I# like to have a tea
a# etae va hote k ilI