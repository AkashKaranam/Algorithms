import java.io.*;
import java.util.*;

public class A
{
	public static void main(String [] args) throws Exception 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int q=0;q<t;q++)
		{
			int n = in.nextInt();
			String s = in.next();
			boolean flag = true;
			if(!s.contains("t"))
			{
				flag = false;
			}
			if(!s.contains("r"))
			{
				flag = false;
			}
			if(!s.contains("y"))
			{
				flag = false;
			}
			if(!s.contains("g"))
			{
				flag = false;
			}
			if(!s.contains("u"))
			{
				flag = false;
			}
			if(!s.contains("b"))
			{
				flag = false;
			}
			if(!flag)
			{
				System.out.println(s);
			}
			else
			{
				String output = "";
				int tcount = 0;
				for(int i=0;i<n;i++)
				{
					if(s.charAt(i) != 't')
					{
						output+=s.charAt(i);
					}
					else
					{
						tcount++;
					}
				}
				for(int i=0;i<tcount;i++)
				{
					output+="t";
				}
				System.out.println(output);
			}
		}
	}
}