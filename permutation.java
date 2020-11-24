import java.io.*;
import java.util.*;
public class permutation {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = n-i;
			}
			if(n % 2 == 1)
			{
				int mid = (n-1)/2;
				int end = n-1;
				int temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
			}

			String str = "";
			for(int i=0;i<n;i++)
			{
				str+= arr[i] + " ";
			}
			System.out.println(str.substring(0,str.length()-1));

		}

	}
}