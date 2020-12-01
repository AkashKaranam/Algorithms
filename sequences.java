import java.io.*;
import java.util.*;

public class sequences {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int q=0;q<t;q++)
		{
			int n = in.nextInt();
			int x = in.nextInt();
			int count = 0;
			boolean flag = false;
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = in.nextInt();
			}
			label:
			while(!sorted(arr))
			{
				for(int i=0;i<n;i++)
				{
					if(arr[i] > x)
					{
						int temp = arr[i];
						arr[i] = x;
						x = temp;
						//System.out.println(Arrays.toString(arr));
						count++;
						break;
					}
					if(i == n-1)
					{
						System.out.println(-1);
						flag = true;
						break label;
					}
					
				}
			}
			if(!flag)
			{
				System.out.println(count);
			}
			

		}
	}
	public static boolean sorted(int [] arr)
	{
		if(arr.length == 1)
		{
			return true;
		}
		else
		{
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i] < arr[i-1])
				{
					return false;
				}
			}
			return true;
		}
	}
}