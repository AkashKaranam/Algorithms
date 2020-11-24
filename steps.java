import java.io.*;
import java.util.*;

public class steps {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] money = new int[n];
		int count = 1;
		int maxcount = 1;
		for(int i=0;i<n;i++)
		{
			money[i] = in.nextInt();
		}

		for(int i=1;i<n;i++)
		{
			
			if(money[i] >= money[i-1])
			{
				count++;
				if(count > maxcount)
				{
					maxcount = count;
				}
			}
			else
			{
				count = 1;
			}
		}
		System.out.println(maxcount);

	}
}