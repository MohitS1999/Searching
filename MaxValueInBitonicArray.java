/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array/0
import java.util.*;
import java.lang.*;
import java.io.*;

class MaxValueInBitonicArray{
	public static void main (String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int t=sc.nextInt();
	    while (t-->0){
	        int n=sc.nextInt();
	        int ar[]=new int[n];
	        for (int i=0;i<n;i++)
	            ar[i]=sc.nextInt();
	        int start=0;
	        int end=n-1;
	        while (start<=end){
	            int mid=(start+end)/2;
	            if ((mid==0) || ar[mid]>ar[mid-1] && ( mid==n-1 || ar[mid] > ar[mid+1]))
	                {
	                    System.out.println(ar[mid]);
	                    break;
	                }
	            else if (ar[mid]<ar[mid+1]) start=mid+1;
	            else end=mid-1;
	        }
	    }
	}
}