import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the text and the keyword: ");
        String text= sc.nextLine();
        String keyword=sc.nextLine();
        int t= text.length();
        int k= keyword.length();
        char[][] arr = new char[k][(t/k)+1];

//        Store the ASCII values of chars in key[]
        int[] key = new int[k];
        for(int i=0; i<k; i++)
            key[i] = (int)keyword.charAt(i) ; 
        
        // for(int i=0; i<k; i++)
        //     System.out.print(key[i]+" ");
        
        
        //Store the text in a char[][]
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
        
        
        //rank[] stores the rank of each char
        //realRank[] gives the order of each column to be printed  i.e realRank[] stores index values of rank[]
        int[] rank= new int[k];
        int[] realRank= new int[k];
        int ran=0;
        for(int i=0; i<k; i++)
        {
        	ran=0;
        	for(int j=0; j<k; j++)
        	{
        		rank[i] = key[i]<key[j] ? rank[i] : ran++;
        	}
        	realRank[rank[i]] = i;
        }
        
//        for(int j=0; j<k; j++)
//    	System.out.print(realRank[j]+" ");
        
        
        System.out.print("CT: ");
        for(int m=0; m<k; m++)
        {
        	for(int d=0; d<(t/k)+1; d++)
        	{
        		System.out.print(arr[d][realRank[m]]);
        	}
        }
        
        
        
	}
}