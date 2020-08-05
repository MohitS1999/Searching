/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/element-appearing-once/0
import java.util.*;
import java.lang.*;
import java.io.*;

class ElementAppearingOnce{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    int temp=sc.nextInt();
		    for (int i=1;i<n;i++){
		        int tx=sc.nextInt();
		        temp=temp^tx;
		    }
		    System.out.println(temp);
		}
	}
}