import java.io.*;
import java.util.*;

public class lucky {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		Long n = in.nextLong();
		String s = n.toString();
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == '4' || s.charAt(i) == '7')
			{
				count++;
			}
		}
		String str = count + "";
		boolean flag = true;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != '4' && str.charAt(i) != '7')
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}