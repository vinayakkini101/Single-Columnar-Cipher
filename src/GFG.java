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
        String[][] arr = new String[k][(t%k)+1];

        int[] key = new int[k];
        for(int i=0; i<k; i++)
            key[i] = (int)keyword.charAt(i); 
        
        // for(int i=0; i<k; i++)
        //     System.out.print(key[i]+" ");
        
        // for(int i=0; i<key.length(); i++)
        // {
            
        // }
        
	}
}