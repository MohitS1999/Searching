/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/kth-smallest-element/0
import java.util.*;
import java.lang.*;
import java.io.*;

class KthSmallestElement{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int ar[]= new int[n];
		    for (int i=0;i<n;i++)
		        ar[i]=sc.nextInt();
		    int k=sc.nextInt();
		    Arrays.sort(ar);
		    System.out.println(ar[k-1]);
		}
	}
}