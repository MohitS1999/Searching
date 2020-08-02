/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/count-the-zeros/0
import java.util.*;
import java.lang.*;
import java.io.*;

class CountTheZeros{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for (int i=0;i<n;i++)
		        ar[i]=sc.nextInt();
		    int start=0,end=n-1,mid;
		    boolean flag=false;
		    while (start<=end){
		        mid=(start+end)/2;
		        if ((mid==0 || ar[mid-1]==1) && (ar[mid]==0)){
		            System.out.println(n-mid);
		            flag=true;
		            break;
		        }
		        else if (ar[mid]==0 && ar[mid-1]==0) end=mid-1;
		        else start=mid+1;
		    }
		    if (!flag) System.out.println("0");
		}
	}
}