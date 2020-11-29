import java.io.*;
import java.util.*;

public class repainting {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int q=0;q<t;q++)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = in.nextInt();
			}

			int min = (int) Math.ceil(n/(double)k);
			//System.out.println(min);
			Set<Integer> colors = new HashSet<Integer>();
			for(int i=0;i<n;i++)
			{
				colors.add(arr[i]);
			}
			for(Integer color: colors)
			{
				int counter = 0;
				int changes = 0;
				while(counter < n)
				{
					if(arr[counter] != color)
					{
						counter = Math.min(n,counter+k);
						changes++;
					}
					else
					{
						counter = Math.min(n, counter+1);
					}
				}
				if(changes < min)
				{
					min = changes;
				}
			}
			System.out.println(min);
		}

	}
}