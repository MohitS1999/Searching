
//https://practice.geeksforgeeks.org/problems/facing-the-sun/0
import java.util.*;
import java.lang.*;
import java.io.*;

class FacingTheSun{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    for (int i=0;i<n;i++)
		        ar[i]=sc.nextInt();
		    int Max=0;
		    int cnt=0;
		    for (int i=0;i<n;i++){
		        if (Max<ar[i]){
		            Max=ar[i];
		            cnt++;
		        }
		    }
		    System.out.println(cnt);
		}
	}
}
