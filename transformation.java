import java.io.*;
import java.util.*;

public class transformation {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int r=0;r<t;r++)
		{
			int n = in.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = in.nextInt();
			}
			ArrayList<Integer> unique = new ArrayList<Integer>();
			unique.add(arr[0]);
			for(int i=1;i<n;i++)
			{
				if(arr[i] != unique.get(unique.size()-1))
				{
					unique.add(arr[i]);
				}
			}
			Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
			for(int i=0;i<unique.size();i++)
			{
				if(!freq.keySet().contains(unique.get(i)))
				{
					freq.put(unique.get(i),1);
				}
				else
				{
					freq.put(unique.get(i), freq.get(unique.get(i))+1);
				}
			}
			int min = Integer.MAX_VALUE;
			for(Map.Entry<Integer,Integer> entry: freq.entrySet())
			{
				if(unique.get(0) == entry.getKey() && unique.get(unique.size()-1) == entry.getKey())
				{
					if(entry.getValue() - 2 < min)
					{
						min = entry.getValue()-2;
					}
				}
				else if(unique.get(0) == entry.getKey() || unique.get(unique.size()-1) == entry.getKey())
				{
					if(entry.getValue() - 1 < min)
					{
						min = entry.getValue()-1;
					}
				}
				else
				{
					if(entry.getValue() < min)
					{
						min = entry.getValue();
					}
				}
			}
			System.out.println(min+1);
		}
	}
}