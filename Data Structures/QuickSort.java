/* Program to implement Quick Sort Algorithm */
import java.util.*;
import java.io.*;
class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("n:");
		n=sc.nextInt();
		String[] names=new String[n];
		System.out.println("Enter names");
		for(int i=0;i<n;i++)
			names[i]=br.readLine();
		quicksort(names,0,names.length-1);
		System.out.println("SOrted");
		for(int i=0;i<n;i++)
			System.out.println(names[i]+" ");
	}
	static void quicksort(String[] array,int lowindex, int highindex)
	{
		if(lowindex>=highindex)
			return;
		String pivot=array[highindex];
		int lp=lowindex;
		int rp=highindex;
		while(lp<rp)
		{
			while(array[lp].compareTo(pivot)<=0 && lp<rp)
				lp++;
			while(array[rp].compareTo(pivot)>=0 && lp<rp)
				rp--;
			swap(array,lp,rp);
		}
		swap(array,lp,highindex);
		quicksort(array,lowindex,lp-1);
		quicksort(array,lp+1,highindex);
	}
	static void swap(String[] array,int index1,int index2)
	{
		String temp;
		temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
}
