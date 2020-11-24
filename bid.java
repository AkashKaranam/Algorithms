import java.io.*;
import java.util.*;

public class bid {
	public static void main(String [] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int r=0;r<t;r++)
		{
			int n = in.nextInt();
			int[] arr = new int[n+1];
			arr[0] = -1;
			for(int i=1;i<arr.length;i++)
			{
				arr[i] = in.nextInt();
			}
			Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
			for(int i=1;i<arr.length;i++)
			{
				if(!freq.keySet().contains(arr[i]))
				{
					freq.put(arr[i], 1);
				}
				else
				{
					freq.put(arr[i], freq.get(arr[i])+1);
				}
			}
			int min = Integer.MAX_VALUE;
			for(Map.Entry<Integer,Integer> entry : freq.entrySet())
			{
				if(entry.getValue() == 1 && entry.getKey() < min)
				{
					min = entry.getKey();
				}
			}

			if(min == Integer.MAX_VALUE)
			{
				System.out.println(-1);
			}
			else
			{
				for(int i=1;i<arr.length;i++)
				{
					if(arr[i] == min)
					{
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
}