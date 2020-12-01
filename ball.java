import java.io.*;
import java.util.*;

public class ball {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int s=0; s<t;s++)
		{
			int n = in.nextInt();
			int p = in.nextInt();
			int k = in.nextInt();
			String str = in.next();
			int[] arr = new int[n+1];
			arr[0] = -1;
			for(int i=1;i<=n;i++)
			{
				if(str.charAt(i-1) == '1')
				{
					arr[i] = 1;
				}
				else
				{
					arr[i] = 0;
				}
			}
			int x = in.nextInt();
			int y = in.nextInt();

			int[] c = new int[n+1];
			for(int i=n;i>n-k;i--)
			{
				c[i] = 1 - arr[i];
			}
			for(int i=n-k;i>=p;i--)
			{
				//System.out.println("I= " + i);
				c[i] = c[i+k] + (1-arr[i]);
			}
			//System.out.println(Arrays.toString(c));

			int minCost = Integer.MAX_VALUE;
			for(int q=p;q<=n;q++)
			{
				if(y*(q-p) + x*c[q] < minCost)
				{
					minCost = y*(q-p) + x * c[q];
				}
			}
			System.out.println(minCost);
		}
	}
}