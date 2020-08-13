
import java.util.*;
import java.lang.*;
import java.io.*;
//https://practice.geeksforgeeks.org/problems/missing-element-of-ap/0/
class MissingElementOfAp{
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while (t-->0){
		    int n=Integer.parseInt(br.readLine().trim());
		    String[] s=br.readLine().split(" ");
		    int ar[]=new int[n];
		    int sum=0;
		    for (int i=0;i<n;i++){
		        ar[i]=Integer.parseInt(s[i]);
		        sum+=ar[i];
		    }
			//Sum of Ap Series
		    int sumOfAp=(n+1)*(ar[0]+ar[n-1])/2;
		    System.out.println(sumOfAp-sum);
		}
	}
}
