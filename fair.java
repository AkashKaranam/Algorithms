import java.io.*;
import java.util.*;

public class fair {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int z=0;z<t;z++)
		{
			Long n = in.nextLong();
			label:
			for(long i=n;i<n+2520;i++)
			{
				if(check(i))
				{
					System.out.println(i);
					break label;
				}
			}

		}
	}
	public static boolean check(long i)
	{
		String s = i + "";
		for(int j=0;j<s.length();j++)
		{
			int digit = Integer.parseInt(s.substring(j,j+1));
			if(digit!=0 && i%digit !=0)
			{
				return false;
			}

		}
		return true;
	}
}