import java.io.*;
import java.util.*;

public class B{
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int q=0;q<t;q++)
		{
			int n = in.nextInt();
			int k = in.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i=0;i<n;i++)
			{
				x[i] = in.nextInt();
				y[i] = in.nextInt();
			}
			int count = n;
			for(int i=0;i<n;i++)
			{
				int innercount = 0;
				for(int j=0;j<n;j++)
				{

					if(Math.abs(x[j] - x[i]) + Math.abs(y[j]-y[i]) > k)
					{
						innercount = 1;
					}
				}
				count-=innercount;
			}
			if(count == 0)
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(1);
			}

		}

		
	}
}