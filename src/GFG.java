import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the text and the keyword: ");
        String text= sc.nextLine();
        String keyword=sc.nextLine().toUpperCase();
        int t= text.length();
        int k= keyword.length();
        char[][] arr = new char[k][(t/k)+1];

        ArrayList key = new ArrayList(k);
        for(int i=0; i<k; i++)
            key.add( (int)keyword.charAt(i) ); 
        
        // for(int i=0; i<k; i++)
        //     System.out.print(key[i]+" ");
        
        int count=0;
        for(int m=0; m<k; m++)
        {
        	for(int d=0; d<(t/k)+1; d++)
        	{
        		if(count<t)
        		{
        			arr[m][d] = (text.charAt(count)==' ') ? '_' :  text.charAt(count);
        			count++;
//        			System.out.print(arr[m][d]+" ");
        		}
        		else
        		{
        			arr[m][d] = '_';
        			count++;
//        			System.out.print(arr[m][d]+" ");
        		}
        	}
//        	System.out.println();
        }
        
        
        
        
        
	}
}