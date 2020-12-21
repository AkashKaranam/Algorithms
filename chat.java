import java.io.*;
import java.util.*;

public class chat {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int r=0;r<t;r++)
		{
			int n = in.nextInt();
			String s = in.next();
			int count = 0;
			for(int i=s.length()-1;i>=0;i--)
			{
				if(s.charAt(i) == ')')
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count > n-count)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}

	}
}