
//https://practice.geeksforgeeks.org/problems/maximum-no-of-1s-row/0
import java.util.*;
import java.lang.*;
import java.io.*;

class MaxNoOf1sRow{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int row=sc.nextInt();
		    int col=sc.nextInt();
		    int ar[][]=new int[row][col];
		    for (int i=0;i<row;i++){
		        for (int j=0;j<col;j++)
		            ar[i][j]=sc.nextInt();
		    }
		    int max=0;
		    int index=0;
		    for (int i=0;i<row;i++){
		        int x=maxHelper(ar[i],col);
		        if (max<x) {
		            max=x;
		            index=i;
		        }
		    }
		    System.out.println(index);
		    
		}
	}
	public static int maxHelper(int ar[],int n){
	    int start=0;
	    int end=n-1;
	    while (start<=end){
	        int mid=(start+end)/2;
	        if ((ar[mid]==1) && (mid==0 || ar[mid-1]==0))
	            return n-mid+1;
	        else if (ar[mid]==1 && ar[mid-1]==1) end=mid-1;
	        else start=mid+1;
	    }
	    return 0;
	}
}
