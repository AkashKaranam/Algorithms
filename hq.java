import java.io.*;
import java.util.*;

public class hq {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		boolean flag = false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9')
			{
				flag = true;
				break;
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