package A;

import java.io.*;
import java.util.*;

public class abc {

    public static void main(String[] args) throws IOException{
        
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt(), i,j;
        int d = sc.nextInt();
        int array[] = new int[a];
        for(i = 0; i<array.length;i++)
        	array[i]= sc.nextInt();
        
        for(i = 0; i < d; i++)
        {
        	int temp = array[a-1];
        	for( j = array.length - 1; j>0; j--)
        	{
        		array[j] = array[j-1];	
        	}
        	array[0] = temp;
        } 
        
        for(j = 0;j<array.length;j++)
        {
        	System.out.print(array[j]+" ");
        } 
        
    }
}
